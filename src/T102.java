/**
 * 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution102 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        Queue<TreeNode> queue = new ArrayDeque<>();
//
//        if (root != null){
//            queue.add(root);
//        }
//
//        while (!queue.isEmpty()){
//
//            int n = queue.size();
//
//            List<Integer> level = new ArrayList<>();
//
//            for (int i = 0; i < n; i++){
//
//                TreeNode node = queue.poll();
//
//                level.add(node.val);
//
//                if (node.left != null)
//                    queue.add(node.left);
//
//                if (node.right != null)
//                    queue.add(node.right);
//
//            }
//
//            ans.add(level);
//
//        }
//
//        return ans;
//    }
//}
public class T102 {
    public static void main(String[] args) {

    }
}
