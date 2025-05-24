// leetcode problem 73 || set matrix zeros (imp.)
package leetcode;

public class setmatrixzero {
  public static void main(String[] args) {
    int[][] matrix = {
      {1,1,1},
      {1,0,1},
      {1,1,1}
    };
    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean firstRowHasZero = false;
    boolean firstColHasZero = false;

    for(int j=0; j<cols; j++){
      if(matrix[0][j] == 0){
        firstRowHasZero = true;
        break;
      }
    }

    for(int i=0; i<rows; i++){
      if(matrix[i][0] == 0){
        firstColHasZero = true;
        break;
      }
    }

    for(int i=1; i<rows; i++){
      for(int j=1; j<cols; j++){
        if(matrix[i][j] == 0){
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    for(int i=1; i<rows; i++){
      for(int j=1; j<cols; j++){
        if(matrix[i][0] == 0 || matrix[0][j] == 0){
          matrix[i][j] = 0;
        }
      }
    }

    if(firstRowHasZero){
      for(int j=0; j<cols; j++){
        matrix[0][j] = 0;
      }
    }

    if(firstColHasZero){
      for(int i=0; i<rows; i++){
        matrix[i][0] = 0;
      }
    }

    System.out.println("Resulting Matrix");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.println(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}