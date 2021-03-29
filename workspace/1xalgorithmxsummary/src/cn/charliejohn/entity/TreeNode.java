package cn.charliejohn.entity;

import cn.charliejohn.utils.StrToArray;

/**
 * @author charlie
 * @date 2021/3/25 - 10:41
 * @description
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.val = data;
    }


    public static TreeNode mkTree(String str) {
        int []array = StrToArray.StrToIntArray(str);
        TreeNode root = createBinaryTreeByArray(array, 0);
        return root ;
    }

    private static TreeNode createBinaryTreeByArray(int[] array, int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            if (array[index] != Integer.MAX_VALUE){
                int value = array[index];
                tn = new TreeNode(value);

                tn.left = createBinaryTreeByArray(array, 2*index+1);
                tn.right = createBinaryTreeByArray(array, 2*index+2);
//                System.out.println(value);
            }else {
                tn = null;
            }
            return tn;
        }
        return tn;
    }
}
