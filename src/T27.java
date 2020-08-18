/**
 * 27. 移除元素
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例2:
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 注意这五个元素可为任意顺序。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 */
class Solution27 {//快慢指针
    public int removeElement(int[] nums, int val) {
        int fast = 0, low = 0;
        for (; fast < nums.length; fast++){
            if (nums[fast] != val){
                nums[low] = nums[fast];
                low++;
            }
        }
        return low;
    }
}

public class T27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        System.out.println(solution27.removeElement(new int[]{3,2,2,3},3));
    }
}
