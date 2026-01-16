package Hashmaps;
import java.util.*;

public class hashmapbasic {
  public static void main (String args[]) {
  // country=key, population=value
  HashMap<String, Integer> map = new HashMap<>();

  // insertion 
  map.put("india", 150);
  map.put("USA", 130);
  map.put("China", 190);
  
  System.out.println(map);

  map.put("China", 200);
  System.out.println(map);

  // search
  if(map.containsKey("China")) {
    System.out.println("The key is present in the map");
  } else {
    System.out.println("The key is not present in the map");
  }

  System.out.println(map.get("China"));

  // iteration in hashmap
  int arr[] = {1,2,3,4};
  for(int val : arr) {
    System.out.print(val + " ");
  }
  System.out.println();

  // iteration in hashmap 

  for(Map.Entry<String, Integer> e : map.entrySet()) {
    System.out.print(e.getKey() + " ");
    System.out.print(e.getValue() + " ");
  }

  map.remove("China");
  System.out.println(map);
 }
}