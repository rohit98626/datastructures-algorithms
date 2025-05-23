package mixed;
public class palindromestring {
  public static void main(String[] args) {
    String name1 = "MOM";
    String rev = "";

    for (int i =0; i<name1.length(); i++) {
      rev = name1.charAt(i)+rev;
    }  
      if (rev.equals(name1)) {
        System.out.println("palindrome");
      } else {
        System.out.println("not palindrome");
      } 
  } 
}