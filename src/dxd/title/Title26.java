package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 11:04 2021/8/27
 * @Description:
 * �������ö����� A �� B���ж� B �ǲ��� A ���ӽṹ��(Լ��������������һ�������ӽṹ)
 * B �� A ���ӽṹ�� �� A ���г��ֺ� B ��ͬ�Ľṹ�ͽڵ�ֵ��
 * ʹ�õݹ����dfs����

 **/

public class Title26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //�����ж��Ƿ�Ϊ��
        if(A == null || B == null) {
            return false;
        }
        //ʹ�û����㷨�жϺ͵ݹ��ж��Ƿ�������������������bƥ��
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        //���ݷ��ж�B�Ƿ�ΪNull��Ϊnull˵��B�Ѿ���ȫ����������true
        if(B == null)return true;
        //���B��Ϊnull����AΪnull��˵��B���ܺ�A��ȫƥ��
        if(A == null)return false;
        //���ݵ�������ֵ��Ȳ������Ҷ����
        return A.val == B.val && dfs(A.right, B.right) && dfs(A.left, B.left);
    }
}
