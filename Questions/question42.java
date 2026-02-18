package Questions;
// find the first non-repeated character in a string
public class question42 {
  public static void main(String[] args) {
    String name1 = "hello";

    for (char c : name1.toCharArray()) {
      if (name1.indexOf(c) == name1.lastIndexOf(c)) {
        System.out.println("first nonrepeated: " + c);
        return;
      }     
    }
    }
  } 