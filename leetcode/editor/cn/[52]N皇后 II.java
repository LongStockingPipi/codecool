//n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。 
//
// 给你一个整数 n ，返回 n 皇后问题 不同的解决方案的数量。 
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：n = 4
//输出：2
//解释：如上图所示，4 皇后问题存在两个不同的解法。
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 9 
// 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。 
// 
// 
// 
// Related Topics 回溯算法 
// 👍 274 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private List<List<String>> result = new ArrayList<>();

    public int totalNQueens(int n) {
        calculate(0, 0, new String[n][n]);
        return result.size();
    }

    private void addResult(String[][] board) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<board.length;i++) {
            String r = "";
            for(int j=0;j<board[0].length;j++) {
                String s = null == board[i][j] ? "." : "Q";
                r = r + s;
            }
            list.add(r);
        }
        result.add(list);
    }

    private void calculate(int x, int n, String[][] board) {
        if(x == board.length && n == board.length) {
            addResult(board);
        } else {
            for(int i=0;i<board.length;i++) {
                if(checkout(x, i, board)) {
                    board[x][i] = "0";
                    calculate(x+1, n+1, board);
                    board[x][i] = null;
                }
            }
        }
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

        while(x>=0 && y<board.length) {
            if("0".equals(board[x][y])) {
                return false;
            }
            x--;
            y++;

        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
