package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 22:59 2021/8/24
 * @Description:
 * 给定一个二叉树和其中的一个节点，如何找出中序遍历序列的下一个节点？。注意，树中的节点不仅包含左右子节点，同时包含指向父节点的指针。
 **/

public class Title08 {
    public TreeNode getNext(TreeNode pNode){
        if(pNode == null) return null;

        if(pNode.right != null){
            TreeNode rNode = pNode.right;
            while (rNode.left != null){
                rNode = rNode.left;
            }
            return rNode;
        }else{
            while (pNode.parent != null){
                TreeNode parentNode = pNode.parent;
                if(parentNode.left == pNode){
                    return parentNode;
                }
                pNode = pNode.parent;
            }
        }
        return null;

    }

}
