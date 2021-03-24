// Description
// Given a binary tree, find the subtree with maximum sum. Return the root of the subtree.

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: the root of binary tree
     * @return: the maximum weight node
     */

    // 1xinit
    TreeNode res = null;
    int temp = Integer.MIN_VALUE;
    // 2xfindxsubxtree
    public TreeNode findSubtree(TreeNode root) {
        // 2x1xcheckxnull
        if(root == null){
            return res;
        }

        // 2x2xdfs
        dfs(root);

        // 2x3xreturn
        return res;
    }

    public int dfs(TreeNode node){
        if(node == null){
            return 0;
        }

        int sum = dfs(node.left) + dfs(node.right) +node.val;

        if(sum>temp){
            res = node;
            temp = sum;
        }

        return sum;
    }
}