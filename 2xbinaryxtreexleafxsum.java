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
   * @param root: the root of the binary tree
   * @return: An integer
   */
  // 1xforxres
  private int res = 0;

  // 2xforxrecursion
  privat void recursion(TreeNode node){
    // 2.1xterminatexcondition
    if(node == null){
      return;
    }
    // 2.2xcalculate
    if(node.left == null && node.right == null){
      res += node.val;
    }
    // 2.3xrecursion
    recursion(node.left);
    recursion(node.right);
  }
  public int leafSum(TreeNode root) {
    // 3xrecursion
    recursion(root);
    return res;
  }
}