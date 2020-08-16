/**
 * 1.两数之和
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例1：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class T1 {
    public static void main(String[] args) {

    }
}
class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0,high = numbers.length - 1;
        while (low < high){
            int sum = numbers[low] + numbers[high];
            if (sum == target)
                return new int[]{low, high};
            else if (sum < target)
                ++low;
            else
                --high;
        }
        return new int[]{-1,-1};
    }
}