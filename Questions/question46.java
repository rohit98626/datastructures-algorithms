package Questions;
// reverse a string

public class question46 {
  public static void main(String[] args) {
    String name1 = "hello";
    String rev = "";

    for (int i=0 ; i<name1.length(); i++) {
      rev=name1.charAt(i)+rev;
    }
    System.out.println(rev);
  } 
}