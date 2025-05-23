package mixed;

public class string1 {
  public static void main(String[] args) {
    String name1 = "rohit"; // string literal
    String name2 = "rohit";
    String name3 = "ROHIT";
    String name4 = "                                   rohit                 ";
    String name5 = "hello";
    String name6 = new String("rohit");

    System.out.println("charAt=" + name1.charAt(2));
    System.out.println("length=" + name1.length());
    System.out.println("substring=" + name1.substring(2,5));
    System.out.println("uppercase=" + name2.toUpperCase());
    System.out.println("lowercase=" + name3.toLowerCase());
    System.out.println("trim=" +name4.trim());
    System.out.println( "replace=" + name5.replace('l', 'p'));
    System.out.println(name5);
    System.out.println("equals=" + name2.equals(name6));

      for (int i=0; i<name1.length(); i++) {
          System.out.print(name1.charAt(i)+ " ");
      }
  }
}

// length() and charAt()

// 
    // 
    



// sub string, uppercase , lowercase , trim , replace