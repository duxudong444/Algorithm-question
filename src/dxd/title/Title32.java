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
 * ���ϵ��´�ӡ����������ÿ���ڵ㣬ͬһ��Ľڵ㰴�մ����ҵ�˳���ӡ��
 * ʹ�ö��У������Ƚ��ȳ����ص㣬���Ƚ�ͷ�ڵ�Ž�ȥ�������в�Ϊ�գ����һ���ڵ㣬��ӡֵ
 * �����˽ڵ㲻Ϊ�յĽڵ�ȫ�������ҷŽ�ȥ��֮��ѭ����һ���̣�ֱ������Ϊ��
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
