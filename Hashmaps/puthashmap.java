package Hashmaps;
import java.util.*;

public class puthashmap {
  static class MyHashMap<K, V> {
    private class Node {
      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int n; // number of nodes
    private int N; // number of buckets
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
      this.N = 4;
      this.buckets = new LinkedList[N];
      for (int i = 0; i < N; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    private int hashFunction(K key) {
      int bucketIndex = key.hashCode();
      return Math.abs(bucketIndex) % N;
    }

    private int searchinLL(K key, int bucketIndex) {
      LinkedList<Node> ll = buckets[bucketIndex];
      for (int i = 0; i < ll.size(); i++) {
        if (ll.get(i).key.equals(key)) { // ✅ use equals
          return i;
        }
      }
      return -1;
    }

    private void rehash() {
      LinkedList<Node>[] oldBuckets = buckets;

      N = N * 2;                  // ✅ update N
      buckets = new LinkedList[N];
      n = 0;                      // ✅ reset size

      for (int i = 0; i < N; i++) {
        buckets[i] = new LinkedList<>();
      }

      for (int i = 0; i < oldBuckets.length; i++) {
        LinkedList<Node> ll = oldBuckets[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          put(node.key, node.value); // ✅ reinsert
        }
      }
    }

    public void put(K key, V value) {
      int bucketIndex = hashFunction(key);
      int dataIndex = searchinLL(key, bucketIndex);

      if (dataIndex == -1) {
        buckets[bucketIndex].add(new Node(key, value));
        n++;
      } else {
        Node node = buckets[bucketIndex].get(dataIndex);
        node.value = value;
      }

      double lambda = (double) n / N;
      if (lambda > 2.0) {
        rehash();
      }
    }

    public boolean containsKey(K key) {
      int bucketIndex = hashFunction(key);
      int dataIndex = searchinLL(key, bucketIndex);
      return dataIndex != -1;
    }

    public V remove(K key) {
      int bucketIndex = hashFunction(key);
      int dataIndex = searchinLL(key, bucketIndex);

      if (dataIndex == -1) {
        return null;
      } else {
        Node node = buckets[bucketIndex].remove(dataIndex);
        n--;
        return node.value;
      }
    }

    public V get(K key) {
      int bucketIndex = hashFunction(key);
      int dataIndex = searchinLL(key, bucketIndex);

      if (dataIndex == -1) {
        return null;
      } else {
        Node node = buckets[bucketIndex].get(dataIndex);
        return node.value;
      }
    }

    public ArrayList<K> keySet() {
      ArrayList<K> keys = new ArrayList<>();

      for (int i = 0; i < buckets.length; i++) {
        LinkedList<Node> ll = buckets[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          keys.add(node.key);
        }
      }
      return keys;
    }

    public boolean isEmpty() {
      return n == 0;
    }
  }

  public static void main(String args[]) {
    MyHashMap<String, Integer> map = new MyHashMap<>();
    map.put("India", 190);
    map.put("China", 530);
    map.put("Russia", 130);
    map.put("USA", 840);

    ArrayList<String> keys = map.keySet();
    for (int i = 0; i < keys.size(); i++) {
      String key = keys.get(i);
      System.out.println(key + " " + map.get(key));
    }
  }
}