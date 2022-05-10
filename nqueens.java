import java.util.*;

public class nqueens {

  static void print(boolean[][] board){
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[0].length;j++){
        if(board[i][j] == true){
          System.out.print("1" + " ");
        }else{
          System.out.print("0" + " ");
        }
      }
      System.out.println("");
    }
    System.out.println("");
  }
  static void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndig, boolean[] rdig) {
    if(row == board.length){
        print(board);
        return;
      }
    for (int col = 0; col < board[0].length; col++) {
      if (cols[col] == false && ndig[row + col] == false && rdig[row - col + board.length - 1]==false) {
        board[row][col] = true;
        cols[col] = true;
        ndig[row+col] = true;
        rdig[row-col+board.length-1] = true;
        solve(board,row+1,cols,ndig,rdig);
        board[row][col] = false;
        cols[col] = false;
        ndig[row+col] = false;
        rdig[row-col+board.length-1] = false;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Board Size: ");
    int n = sc.nextInt();
    boolean[][] board = new boolean[n][n];
    boolean[] cols = new boolean[n];
    boolean[] ndig = new boolean[2 * n - 1];
    boolean[] rdig = new boolean[2 * board.length - 1];
    solve(board,0,cols,ndig,rdig);
  }
}
