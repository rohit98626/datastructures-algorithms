// n queens
package backtracking;

import java.util.*;

public class nqueens {

  public boolean isSafe(int row, int col, char[][] board) {
    // Check vertical up
    for (int i = 0; i < row; i++) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    // Check upper left diagonal
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    // Check upper right diagonal
    for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    return true;
  }

  public void saveBoard(char[][] board, List<List<String>> allBoards) {
    List<String> newBoard = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      String row = new String(board[i]); // use built-in conversion
      newBoard.add(row);
    }
    allBoards.add(newBoard);
  }

  public void helper(char[][] board, List<List<String>> allBoards, int row) {
    if (row == board.length) {
      saveBoard(board, allBoards);
      return;
    }

    for (int col = 0; col < board.length; col++) {
      if (isSafe(row, col, board)) {
        board[row][col] = 'Q';
        helper(board, allBoards, row + 1);
        board[row][col] = '.'; // backtrack
      }
    }
  }

  public List<List<String>> solvenqueens(int n) {
    List<List<String>> allBoards = new ArrayList<>();
    char[][] board = new char[n][n];

    // Initialize the board with '.'
    for (int i = 0; i < n; i++) {
      Arrays.fill(board[i], '.');
    }

    helper(board, allBoards, 0);
    return allBoards;
  }

  public static void main(String[] args) {
    nqueens nq = new nqueens();
    int n = 4; // Example
    List<List<String>> solutions = nq.solvenqueens(n);
    for (List<String> board : solutions) {
      for (String row : board) {
        System.out.println(row);
      }
      System.out.println();
    }
  }
}