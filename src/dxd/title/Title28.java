package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 11:41 2021/8/27
 * @Description:
 * ��ʵ��һ�������������ж�һ�ö������ǲ��ǶԳƵġ����һ�ö����������ľ���һ������ô���ǶԳƵġ�
 * ���룺root = [1,2,2,3,4,4,3]
 * �����true
 * ���ǵݹ�
 **/

public class Title28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return isSame(root.left, root.right);


    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && isSame(left.left, right.right) && isSame(left.right, right.left);
    }
}
