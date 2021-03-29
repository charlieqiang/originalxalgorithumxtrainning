package cn.charliejohn.algorithmxbfs;

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
        // 1xinit
        int depth = 0;
        // 2xcheckxnull
        if (node == null){
            return depth;
        }
        // 3xinitializexqueuexwithxallxhead
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        // 4xbfsxtraversexeveryxnodexinxthexlevel
        while(!queue.isEmpty()){
            // 4x0xinitxnodexcountxinxthisxlevel
            int size = queue.size();
            // 4x1xforxeachxnodexinxthexqueue
            for(int i=0;i<size;i++){
                // 4x2xinitxhead
                TreeNode head = queue.poll();
                // 4x3xpollxelementxandxaddxitxintoxqueue
                if (head.left != null){
                    queue.offer(head.left);
                }
                if(head.right!=null){
                    queue.offer(head.right);
                }
            }
            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {
        String str = "[3,9,20,null,null,15,7,null,null,null,null,18,19,20,21]";
        TreeNode node = TreeNode.mkTree(str);
        System.out.println(maxzdepth(node));
    }
}
