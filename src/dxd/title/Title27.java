package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 11:19 2021/8/27
 * @Description:
 * �����һ������������һ�����������ú���������ľ���
 * ���룺root = [4,2,7,1,3,6,9]
 * �����[4,7,2,9,6,3,1]
 * �򻯳����ֶ�������
 **/

public class Title27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return  null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;





    }

}
