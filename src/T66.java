/**
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
class Solution66 {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] = digits[i] + 1;
        for ( ; i >= 1 ; i--){
            if (digits[i] >= 10){
                digits[i-1]++;
                digits[i] = digits[i] % 10;
            }
        }
        return digits;
    }
}
public class T66 {
    public static void main(String[] args) {
        int [] dig = new int[]{9};
        Solution66 solution = new Solution66();
        solution.plusOne(dig);
        for (int i = 0; i < dig.length; i++){
            System.out.println(dig[i]);
        }
    }
}
