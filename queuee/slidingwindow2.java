// sliding window maximum
// using Monotonic stack deque

package queuee;

import java.util.*;

public class slidingwindow2 {
  public static void main(String[] args) {
    int[] arr = {1,3,-1,-3,5,3,7,1,6};
    int k = 3;
    int n = arr.length;

    List<Integer> list = new ArrayList<>();
    Deque<Integer> deck = new ArrayDeque<>();

    for(int i=0; i< n; i++) {

      while(!deck.isEmpty() && deck.peekFirst() <= i - k) {
        deck.pollFirst();
      }

      while(!deck.isEmpty() && arr[deck.peekLast()] <= arr[i]) {
        deck.pollLast();
      }

      deck.addLast(i);

      if(i >= k-1) {
        list.add(arr[deck.peekFirst()]);
      }
    }
    System.out.println(list);
  } 
}