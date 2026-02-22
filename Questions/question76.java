package Questions;

public class question76 {
  public static void main(String[] args) {

    int n = 9; 
    n >>= Integer.numberOfTrailingZeros(n);

    int maxGap = 0, gap = 0;

    while (n > 0) {

      if ((n & 1) == 1) {
        maxGap = Math.max(maxGap, gap);
        gap = 0;
      } else {
        gap++;
      }
      n >>= 1;   
    }
    System.out.println(maxGap);
  }
}