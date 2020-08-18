/**
 * 69. x 的平方根
 * 实现int sqrt(int x)函数。
 * 计算并返回x的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 *示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 */
class Solution69 {
    public int mySqrt(int x) {
        for(int i = 0; ; i++){
            long sum = i*i;
            if(sum > x){
                return i-1;
            }
        }
    }
}

public class T69 {
    public static void main(String[] args) {
        Solution69 solution69 = new Solution69();
        System.out.println(solution69.mySqrt(1));
    }
}
