package bitmanipulation;

public class clearbit {
  public static void main(String[] args) {
    int n = 5; //0101
    int pos = 2;
    int bitMask = 1<<pos;
    int notBitmask = ~(bitMask);

    int newNumber = notBitmask & n;
    System.out.println(newNumber);
  }
}