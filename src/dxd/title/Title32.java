package dxd.title;

import dxd.usedClass.ListNode;
import dxd.usedClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Xudong Du
 * @Date: Create in 21:07 2021/8/27
 * @Description:
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * 使用队列，利用先进先出的特点，首先将头节点放进去，当队列不为空，输出一个节点，打印值
 * 并将此节点不为空的节点全部从左到右放进去，之后循环这一过程，直到队列为空
 **/

public class Title32 {
    public static int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];

        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root); }};
        ArrayList<Integer> array = new ArrayList<>();

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            array.add(temp.val);

            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        int[] printTree = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            printTree[i] = array.get(i);
        }
        return printTree;




    }
}
