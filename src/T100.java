/**
 * 100. 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例1:
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 * 输出: true
 * 示例 2:
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 * 输出: false
 */

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * 深度优先遍历
 * 若两个都为空，一定相等
 * 若一个为空，一个不为空，一定不相等
 * 两棵树的左节点和右节点也一定分别相等
 */
//class Solution100 {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null){
//            return true;
//        }
//        if (p == null || q == null){
//            return false;
//        }
//        if (p.val != q.val){
//            return false;
//        }
//        else
//            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//    }
//}

public class T100 {
    public static void main(String[] args) {

    }
}
