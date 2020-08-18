/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序遍历。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 */

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution94{
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        zhongxubianli(root, nums);
//        return nums;
//    }
//
//    public void zhongxubianli(TreeNode root, ArrayList<Integer> nums){//中序遍历
//        if (root != null){
//            zhongxubianli(root.left, nums);
//            nums.add(root.val);
//            zhongxubianli(root.right, nums);
//        }
//    }
//
//}

public class T94 {
    public static void main(String[] args) {

    }
}
