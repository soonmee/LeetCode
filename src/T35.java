/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= target){
                return i;
            }
        }
        if (nums[nums.length - 1] < target){
            return nums.length;
        }
        return -1;
    }
}
//二分法
class Solution35_2 {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int ans = nums.length;
        while (i <= j){
            int mid = i + (j-i)/2 + 1;
            if (target <= nums[mid]){
                ans = mid;
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return ans;
    }
}

public class T35 {
    public static void main(String[] args) {
        Solution35_2 solution35 = new Solution35_2();
        System.out.println(solution35.searchInsert(new int[]{1,3,5,6},5));
    }
}
