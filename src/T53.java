/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
class Solution53 {
    public int maxSubArray(int nums[]){
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] > 0){
                nums[i] = nums[i - 1] + nums[i];
            }
            ans = Math.max(ans, nums[i]);
        }
        return ans;
    }
}

public class T53 {
    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        System.out.println(solution53.maxSubArray(new int[]{-2,1}));
    }
}