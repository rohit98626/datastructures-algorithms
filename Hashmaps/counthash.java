// count frequency of each element using hashmap
package Hashmaps;
import java.util.*;

public class counthash {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,2,1,6,3,5};

    HashMap<Integer, Integer> map = new HashMap<>();

    // building frequency map 
    for (int i=0; i<arr.length; i++) {
      int element = arr[i];

      if(map.containsKey(element)) {
        int previousCount = map.get(element);
        map.put(element, previousCount + 1);
      } else {
        map.put(element, 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }
}