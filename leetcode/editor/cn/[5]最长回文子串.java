//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 
// 👍 3653 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        return way1(s);
    }

    private String way1(String s) {
        String result = "";
        int maxLen = 0;

        Character jing = new Character('#');
        StringBuilder sb = new StringBuilder("#");
        for(int i=0;i<s.length();i++) {
            sb.append(s.charAt(i)).append("#");
        }
        s = sb.toString();
        int len = s.length();
        for (int i = 1; i < len; i++) {
            int c = Math.min(i, len - i - 1);
            String str = "";
            int strLen = 0;
            for (int j = 1; j <= c; j++) {
                if(!jing.equals(s.charAt(i)) && strLen == 0) {
                    str = s.charAt(i) + "";
                    strLen = 1;
                }
                Character cleft = s.charAt(i - j);
                Character cright = s.charAt(i + j);
                if (cleft != cright) {
                    break;
                }
                if (!jing.equals(cleft) && !jing.equals(cright)) {
                    strLen = j + 1;
                    str = cleft + str + cright;
                }
            }
            if (strLen > maxLen) {
                maxLen = strLen;
                result = str;
            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
