//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 
// 👍 645 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        return add(false, 1, a.toCharArray(), b.toCharArray(), "");
    }

    private String add(boolean bit, int site, char[] charArrayA, char[] charArrayB, String result) {
        int alen = charArrayA.length;
        int blen = charArrayB.length;
        if(alen >= site || blen >= site) {
            int ac = alen >= site ? Integer.parseInt(charArrayA[alen-site]+"") : 0;
            int bc = blen >= site ? Integer.parseInt(charArrayB[blen-site]+"") : 0;
            int sum = ac + bc + (bit ? 1:0);
            boolean bit_ = false;
            site++;
            if(sum > 1) {
                bit_ = true;
                int p = sum-2;
                return add(bit_, site, charArrayA, charArrayB, p+result);
            } else {
                return add(bit_, site, charArrayA, charArrayB, sum+result);
            }
        } else {
            return bit ? "1"+result : result;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
