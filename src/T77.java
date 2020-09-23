import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *
 * 示例:
 * 输入:n = 4, k = 2
 * 输出:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= n - k + 1; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            for (int j = 0; j < k; j++){
                
            }
        }


        return ans;
    }
}
public class T77 {
    public static void main(String[] args) {

    }
}
