package staack;
import java.util.Stack;
import java.util.Iterator;

public class basicstack {
  public static void main(String[] args) {

    Stack<Integer> ob = new Stack<>();
    ob.push(10); // inserts
    ob.push(20);
    ob.push(30);
    ob.push(40);
    ob.push(50);
    System.out.println(ob.pop());
    System.out.println(ob.peek());
    System.out.println(ob.isEmpty());
    System.out.println(ob.size());
    System.out.println("enhanced loop");
    
    for(Integer i:ob) {
      System.out.println(i + "");
    }
    System.out.println();
    System.out.println("iterator");

    Iterator it = ob.iterator();
      while(it.hasNext()){
        System.out.println(it.next()+ "");
    }
  }
}