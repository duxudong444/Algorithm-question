package dxd.title;

import dxd.usedClass.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: Xudong Du
 * @Date: Create in 22:38 2021/8/24
 * @Description:
 * ����ĳ��������ǰ���������������Ľ�������ؽ��ö����������������ǰ���������������Ľ���ж������ظ������֡�
 * ����
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 **/

public class Title07 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;

        int rootValue = preorder[0];
        int rootIndex = 0;
        for(int i = 0; i<preorder.length; i++){
            if(inorder[i] == rootValue){
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(Arrays.copyOfRange(preorder,1,rootIndex+1),
                Arrays.copyOfRange(inorder,0,rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, rootIndex+1, preorder.length),
                Arrays.copyOfRange(inorder, rootIndex+1,inorder.length));
        return root;

    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode tn = buildTree(preorder,inorder);
        System.out.println(tn);
    }
}
