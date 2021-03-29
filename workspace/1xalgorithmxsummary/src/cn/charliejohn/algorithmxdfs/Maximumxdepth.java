package cn.charliejohn.algorithmxdfs;

import cn.charliejohn.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author charlie
 * @date 2021/3/25 - 10:38
 * @description
 */
public class Maximumxdepth {

    public static int maxzdepth(TreeNode node){
        // 1xbasecasextoxavoidxinfinitexloop
        if (node == null){
            return 0;
        }
        // 2xaskxthexchildxforxhelpxbyxdfsxrecursion
        int leftxlevel = maxzdepth(node.left);
        int rightxlevel = maxzdepth(node.right);
        // 3xparentxgetxhelp
        int depth = Math.max(leftxlevel,rightxlevel)+1;
        // 4xreturn
        return depth;
    }

    public static void main(String[] args) {
        String str = "[3,9,20,null,null,15,7,null,null,null,null,18,19,20,21]";
        TreeNode node = TreeNode.mkTree(str);
        System.out.println(maxzdepth(node));
    }
}
