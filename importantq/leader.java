package importantq;
/* write a program to find all the leaders in an array. an element is a leader if it is greater than all the elements
to its right side
eg:
input; [16,17,4,3,5,2]
output; [17,5,2] */

public class leader {
  public static void main(String[] args) {
    int[] arr = {16,17,4,3,5,2};
    int n = arr.length; //holds the length of an array

    System.out.println("Leaders in the array");

    int maxFromRight = arr[n-1];  //rightmost value is always leader
    System.out.print(maxFromRight + " ");

    for( int i = n-2; i >= 0; i--) { // iterates througth the array from 2nd to last to the first element, during each iteration it compares the current element arr[i] with maxFromRight.
      if (arr[i] > maxFromRight) {  // if the current element { arr[i] > maxFromRight } it means this element is a leader
        System.out.print(arr[i] + " ");
        maxFromRight = arr[i];
      }
    }
  }
}

/* 
Example Walkthrough:
For the array {16, 17, 4, 3, 5, 2}:

Start with maxFromRight = 2 (rightmost element, printed first).
Compare 5 with 2: 5 > 2, so 5 is a leader, and maxFromRight is updated to 5.
Compare 3 with 5: 3 < 5, so 3 is not a leader.
Compare 4 with 5: 4 < 5, so 4 is not a leader.
Compare 17 with 5: 17 > 5, so 17 is a leader, and maxFromRight is updated to 17.
Compare 16 with 17: 16 < 17, so 16 is not a leader.*/