package cn.charliejohn.algorithmxdfs;

import cn.charliejohn.entity.TreeNode;

/**
 * @author charlie
 * @date 2021/3/25 - 10:38
 * @description
 */
public class Maximumxpathxsum {

    public static int maxzsum(TreeNode node){
        // 1xbasecasextoxavoidxinfinitexloop
        int depth = 0;
        // 2xaskxthexchildxforxhelpxbyxdfsxrecursion

        // 3xparentxgetxhelp

        // 4xreturn
        return depth;
    }

    public static void main(String[] args) {
        String str = "[3,9,20,null,null,15,7,null,null,null,null,18,19,20,21]";
        TreeNode node = TreeNode.mkTree(str);
        System.out.println(maxzsum(node));
    }
}
