package dxd.title;

import dxd.usedClass.TreeNode;

/**
 * @author: Xudong Du
 * @Date: Create in 11:04 2021/8/27
 * @Description:
 * 输入两棵二叉树 A 和 B，判断 B 是不是 A 的子结构。(约定空树不是任意一个树的子结构)
 * B 是 A 的子结构， 即 A 中有出现和 B 相同的结构和节点值。
 * 使用递归加上dfs回溯

 **/

public class Title26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //首先判断是否为空
        if(A == null || B == null) {
            return false;
        }
        //使用回溯算法判断和递归判断是否有左子树和右子树与b匹配
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        //回溯法判断B是否为Null，为null说明B已经完全遍历，返回true
        if(B == null)return true;
        //如果B不为null，而A为null，说明B不能和A完全匹配
        if(A == null)return false;
        //回溯的条件，值相等并且左右都相等
        return A.val == B.val && dfs(A.right, B.right) && dfs(A.left, B.left);
    }
}
