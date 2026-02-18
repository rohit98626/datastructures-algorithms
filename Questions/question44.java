package Questions;
// check no of vowels in a string 
public class question44 {
  public static void main(String[] args) {
    String name1 = "rohit";
    int vowelcount = 0;

    for (int i = 0; i < name1.length(); i++) {
      char ch = Character.toLowerCase(name1.charAt(i));
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelcount++;
      }
    }
    System.out.println("Number of vowels: " + vowelcount);
  } 
}