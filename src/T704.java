/**
 * 704. 二分查找
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 */
class Solution704 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j){
            int mid = i + (j - i) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target){
                j = mid - 1;
            }else if (nums[mid] < target){
                i = mid + 1;
            }
        }
        return -1;
    }
}
public class T704 {
    public static void main(String[] args) {
        int nums[] = new int[]{-1,0,3,5,9,12};
        int target = 2;
        Solution704 solution704 = new Solution704();
        System.out.println(solution704.search(nums, target));
    }
}
