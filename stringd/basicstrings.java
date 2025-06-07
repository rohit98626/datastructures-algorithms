package stringd;

public class basicstrings {
  public static void main(String[] args) {

    //concatenation of strings
    String firstName = "r";
    String lastName = "p";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    System.out.println(fullName.length());

    //comparation of strings
    String Name1 = "Tony";
    String Name2 = "Tony";

    //1 s1 > s2 : +ive value
    //2 s1 == s2 : 0
    //3 s1 < s2 : -ive value

    if(Name1.compareTo(Name2) == 0 ){
      System.out.println("Strings are Equal");
    }else{
      System.out.println("Strings are not Equal");
    }


    //substring
    String sentence = "My name is Khan";
    String name = sentence.substring(11, sentence.length());
    System.out.println(name);
  }    
}