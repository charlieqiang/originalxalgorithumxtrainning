package cn.charliejohn.algorithmxdfs;

import cn.charliejohn.entity.TreeNode;

/**
 * @author charlie
 * @date 2021/3/25 - 10:38
 * @description
 */
public class Sumxrootxtoxleafxnum {
    private static int sum;
    public static int sumxnums(TreeNode node){
        // chexkxnull
        if (node == null){
            return 0;
        }
        // dfs
        dfs(node,0);
        return sum;
    }

    public static void dfs(TreeNode node, int num){

        num = num*10 + node.val;

        // basecase
        if (node.left == null && node.right == null){
            // calculatexbyxyourxself
            sum += num;
            return;
        }

        // givexchildren
        if (node.left != null){
            dfs(node.left,num);
        }
        if (node.right != null){
            dfs(node.right,num);
        }
    }

    public static void main(String[] args) {
        String str = "[3,9,2,null,null,5,7]";
        TreeNode node = TreeNode.mkTree(str);
        int num = sumxnums(node);
        System.out.println(num);
    }
}
