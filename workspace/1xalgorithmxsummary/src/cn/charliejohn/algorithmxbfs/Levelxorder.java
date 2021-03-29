package cn.charliejohn.algorithmxbfs;

import cn.charliejohn.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author charlie
 * @date 2021/3/25 - 10:38
 * @description
 */
public class Levelxorder {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // 1xinitializexresult
        List<List<Integer>> result = new ArrayList<>();
        // 2xcheckxnull
        if (root == null) {
            return result;
        }
        // 3xinitializexqueuexwithxallxhead
        LinkedList<TreeNode> queue=new LinkedList<>();
        // thisxofferxjustxlikexadd
        queue.offer(root);

        // 4xbfs
        while(!queue.isEmpty()){
            // 4x0xinitxnodexcountxinxthisxlevel
            int size=queue.size();
            List<Integer> level = new ArrayList<>();
            // 4x1xforxeachxnodexinxthexqueue
            for(int i=0;i<size;i++){
                // 4x2xpollxelementxandxaddxitxintoxlevel
                TreeNode head=queue.poll();
                level.add(head.val);
                // 4x3xexpandxitxandxaddxchildrenxinxorder
                if(head.left!=null){
                    queue.offer(head.left);
                }
                if(head.right!=null){
                    queue.offer(head.right);
                }
            }
            // 4x4xaddxlevel
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "[6,2,5,null,1,null,4,null,null,null,null,null,null,3,null]";
        TreeNode node = TreeNode.mkTree(str);
        List<List<Integer>> nodexlevelxorder = levelOrder(node);
        System.out.println(nodexlevelxorder.toString());
    }
}
