/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树[1,2,2,3,4,4,3] 是对称的。
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个[1,2,2,null,3,null,3] 则不是镜像对称的:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
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

/**
 * 递归函数
 * 通过「同步移动」两个指针的方法来遍历这棵树，
 * p 指针和 q 指针一开始都指向这棵树的根，
 * 随后 p 右移时，q 左移，p 左移时，q 右移。
 * 每次检查当前 p 和 q 节点的值是否相等，如果相等再判断左右子树是否对称
 */
//class Solution101 {
//    public boolean isSymmetric(TreeNode root) {
//        return pd(root, root);
//    }
//
//    private boolean pd(TreeNode p, TreeNode q) {
//        if (p == null && q == null)
//            return true;
//        if (p == null || q == null)
//            return false;
//        return p.val == q.val && pd(p.left, q.right) && pd(p.right, q.left);
//    }
//}
public class T101 {
    public static void main(String[] args) {

    }
}
