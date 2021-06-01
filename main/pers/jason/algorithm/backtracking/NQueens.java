package pers.jason.algorithm.backtracking;

/**
 * @author Jason
 * @date 2021/6/1 23:04
 * @description
 */
public class NQueens {

  /*
  已知 4*4的矩阵，求出落入棋子的所有情况，规则为 任意两个棋子不得在同一行、同一列、同一对角线;
   */

  private static int count = 0;

  private static int QUEENS_COUNT = 8;

  public static void main(String[] args) {
    calculate(0, 0, new String[QUEENS_COUNT][QUEENS_COUNT]);
    System.out.println(QUEENS_COUNT + "皇后共" + count + "种解法");
  }

  private static void calculate(int x, int n, String[][] board) {
    if(x == QUEENS_COUNT && n == QUEENS_COUNT) {
      printStringArray(board);
      count++;
    } else {
      for(int i=0;i<QUEENS_COUNT;i++) {
        if(checkout(x, i, board)) {
          board[x][i] = "0";
          calculate(x+1, n+1, board);
          board[x][i] = null;
        }
      }
    }
  }

  private static void printStringArray(String[][] board) {
    for(int i=0;i<board.length;i++) {
      System.out.print("[");
      for(int j=0;j<board[0].length;j++) {
        System.out.print(null == board[i][j] ? " ," : board[i][j] + ",");
      }
      System.out.print("]");
      System.out.println();
    }
    System.out.println("- - - - - - - - - -");
  }

  private static boolean checkout(int i, int j, String[][] board) {
    for(int a=0;a<i;a++) {
      if("0".equals(board[a][j])) {
        return false;
      }
    }

    int x = i-1;
    int y = j+1;

    i--;
    j--;


    while(i >= 0 && j >= 0) {
      if("0".equals(board[i][j])) {
        return false;
      }
      i--;
      j--;
    }

    while(x>=0 && y<QUEENS_COUNT) {
      if("0".equals(board[x][y])) {
        return false;
      }
      x--;
      y++;

    }

    return true;
  }



}
