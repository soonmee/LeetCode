/**
 * 1.两数之和
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例1：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
class Solution1 {//暴力解法
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++){
            int k = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++){
                if (k == numbers[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}

public class T1 {
    public static void main(String[] args) {
        int numbers[] = new int[]{2,11,7,15};
        int target = 9;
        Solution1 solution1 = new Solution1();
        int ans[] = solution1.twoSum(numbers,target);
        for (int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}