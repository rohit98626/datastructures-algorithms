package stringd;

public class stringbuilders {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("tony");
  
    System.out.println(sb);
    // char at index 0
    System.out.println(sb.charAt(0));

    // set char at index 0
    sb.setCharAt(0, 's');
    System.out.println(sb);

    // insert char at index 0
    sb.insert(0, 'p');
    System.out.println(sb);

    //delete
    sb.delete(2, 4);
    System.out.println(sb);

    //append
    sb.append('c');
    sb.append('h');
    sb.append('o');
    System.out.println(sb);
    System.out.println(sb.length());
  } 
}