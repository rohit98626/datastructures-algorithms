package mixed;
// find the first non-repeated character in a string
public class nonrepeatedstring {
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
// count the no of vowels in a string
// check if two strings are anagrams
// find the longest palindromic substring in a string
// count the number of words in a string