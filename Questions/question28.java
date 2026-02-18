// Find maximum Profit from a Stock
package Questions;

public class question28 {
  public static void main(String[] args) {

    int prices[] = {7,1,5,3,6,4};
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i=0; i<prices.length; i++) {

      minPrice = Math.min(minPrice, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - minPrice);
    }
    System.out.println(maxProfit);
  }
}