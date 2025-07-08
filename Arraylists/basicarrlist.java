package Arraylists;
import java.util.ArrayList;
import java.util.Collections;

class basicarrlist {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    //add 
    list.add(0);
    list.add(2);
    list.add(5);

    System.out.println(list);

    //get 
    int element = list.get(1);
    System.out.println(element);

    // add element in between 
    list.add(1,90);
    System.out.println(list);

    //set element
    list.set(0,21);
    System.out.println(list);

    //delete element
    list.remove(3);
    System.out.println(list);

    // size 
    int size = list.size();
    System.out.println(size);

    //loops
    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }
    System.out.println();

    //sorting
    Collections.sort(list);
    System.out.println(list);
  }
}