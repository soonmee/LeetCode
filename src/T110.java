/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例1：
 * 给定二叉树 [3,9,20,null,null,15,7]
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 * 示例2：
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *         1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 *  返回 false 。
 */

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution110 {
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        } else {
//            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//        }
//    }
//
//    public int height(TreeNode root) {
//        if (root == null) {
//            return 0;
//        } else {
//            return Math.max(height(root.left), height(root.right)) + 1;
//        }
//    }
//}

public class T110 {
    public static void main(String[] args) {

    }
}

