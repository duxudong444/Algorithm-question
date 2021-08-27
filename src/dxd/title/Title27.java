package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 11:19 2021/8/27
 * @Description:
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 * 简化成人字二叉树，
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
