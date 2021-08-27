package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 11:41 2021/8/27
 * @Description:
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 还是递归
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
