package dxd.title;

import java.util.Stack;

/**
 * @author: Xudong Du
 * @Date: Create in 21:05 2021/8/27
 * @Description:
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中
 * 调用 min、push 及 pop 的时间复杂度都是 O (1)。
 * 维护两个栈，一个栈保存正常数据，另一个栈保存当前数据对应的最小值
 **/

public class Title30 {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> min;
    public Title30() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public int top() {
        return stack.peek();

    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int min() {
        return min.peek();
    }

    public void push(int i) {
        stack.push(i);
        if(min.isEmpty()){
            min.push(i);
        }else{
            int temp = min.peek();
            if(temp < i) {
                min.push(temp);
            }else if(temp >=i){
                min.push(i);
            }


        }
    }
}
