package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 22:59 2021/8/24
 * @Description:
 * ����һ�������������е�һ���ڵ㣬����ҳ�����������е���һ���ڵ㣿��ע�⣬���еĽڵ㲻�����������ӽڵ㣬ͬʱ����ָ�򸸽ڵ��ָ�롣
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
