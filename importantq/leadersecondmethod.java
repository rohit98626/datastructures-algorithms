// print the leader from last to first 
package importantq;
public class leadersecondmethod {
  public static void main (String[] args) {
    int arr[] = {16, 17, 4, 3, 5, 2};
    int n = arr.length;
    int leaderArr[] = new int[n];
    int count = 0;

    leaderArr[count] = arr[n - 1]; // Last element is always a leader
    System.out.println(leaderArr[count]);

    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > leaderArr[count]) {
        count++;
        leaderArr[count] = arr[i];
        System.out.println(leaderArr[count]); // Print the current leader
      }
    }
  }
}