//给一非空的单词列表，返回前 k 个出现次数最多的单词。 
//
// 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。 
//
// 示例 1： 
//
// 
//输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
//输出: ["i", "love"]
//解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
//    注意，按字母顺序 "i" 在 "love" 之前。
// 
//
// 
//
// 示例 2： 
//
// 
//输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k
// = 4
//输出: ["the", "is", "sunny", "day"]
//解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
//    出现次数依次为 4, 3, 2 和 1 次。
// 
//
// 
//
// 注意： 
//
// 
// 假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。 
// 输入的单词均由小写字母组成。 
// 
//
// 
//
// 扩展练习： 
//
// 
// 尝试以 O(n log k) 时间复杂度和 O(n) 空间复杂度解决。 
// 
// Related Topics 堆 字典树 哈希表 
// 👍 287 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        return way1(words, k);
    }

    private List<String> way1(String[] words, int k) {
        Map<String, Integer> mapper = new HashMap<>();
        String[] top = new String[k];

        for(int i=0;i<words.length;i++) {
            String word = words[i];
            int count = 1;
            if(mapper.containsKey(word)) {
                count = count + mapper.get(word);
            }
            mapper.put(word, count);

            for(int j=0;j<top.length;j++) {
                String topValue = top[j];
                if(null == topValue) {
                    top[j] = word;
                    break;
                }
                if(topValue.equals(word)) {
                    break;
                }
                int topCount = mapper.get(topValue);
                if(topCount < count) {
                    removeTop(word, j, top, word);
                    break;
                } else if(topCount == count && topValue.compareTo(word)>0) {
                    removeTop(word, j, top, word);
                    break;
                }
            }
        }
        return Arrays.asList(top);
    }

    private void removeTop(String v, int site, String[] array, String origin) {
        if((site<array.length && null != v) ) {
            String old = array[site];
            array[site] = v;
            site++;
            if(null != old && !old.equals(origin)) {
                removeTop(old, site, array, origin);
            }

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
