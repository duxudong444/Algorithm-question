package dxd.title;

import java.util.Stack;

/**
 * @author: Xudong Du
 * @Date: Create in 21:34 2021/8/27
 * @Description:
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，
 * 序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
 * 但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 * 构建一个辅助栈，将压栈序列的值逐一压栈进去，并将辅助栈栈顶的数值和弹出序列的值一一比较，相等则弹出，不相等继续压栈，直到相等
 * 如果压栈进去后，没有全部弹出，说明，不匹配
 **/

public class Title31 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0 && popped.length == 0) return true;
        if(pushed.length != popped.length) return false;
        Stack<Integer> assisted = new Stack<>();
        //指向弹出序列
        int j=0;
        for(int i=0; i<pushed.length; i++){
            assisted.push(pushed[i]);
            while(!assisted.isEmpty() && assisted.peek() == popped[j]){
                assisted.pop();
                j++;
            }
        }
        //如果为空，则说明匹配，返回ture
        return assisted.isEmpty();

    }

    public static void main(String[] args) {
        int[] pushed = {};
        int[] popped = {};
        System.out.println(validateStackSequences(pushed,popped));
    }
}
