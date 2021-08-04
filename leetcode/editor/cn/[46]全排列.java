//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
// Related Topics 数组 回溯 
// 👍 1436 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        calculate(new ArrayList<>(), 0, nums);
        return result;
    }

    private void calculate(List<Integer> list, int site, int[] nums) {
        if(list.size() == nums.length) {
            result.add(list);
        } else {
            for(int i=0;i<nums.length;i++) {
                if(validate(list, nums[i])) {
                    List<Integer> newList = new ArrayList<>();
                    newList.addAll(list);
                    newList.add(nums[i]);
                    site++;
                    calculate(newList, site, nums);
                }
            }
        }
    }

    private boolean validate(List<Integer> list, int ele) {
        for(Integer i: list) {
            if(i == ele) {
                return false;
            }
        }
        return true;
    }


}
//leetcode submit region end(Prohibit modification and deletion)
