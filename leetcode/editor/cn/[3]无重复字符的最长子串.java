//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 5436 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, int[]> map = new HashMap<>();
        int len = 0;
        int len2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                int[] v = map.get(c);
                v[1] = Math.max(v[1],i-v[0]);
                v[0] = i;
                len = Math.max(len, v[1]);
                len2 = 1;
            } else {
                int[] intArray = new int[]{i,1};
                map.put(c, intArray);
                len = Math.max(len, len2++);
            }
        }
        return len;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
