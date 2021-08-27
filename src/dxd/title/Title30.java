package dxd.title;

import java.util.Stack;

/**
 * @author: Xudong Du
 * @Date: Create in 21:05 2021/8/27
 * @Description:
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص� min �����ڸ�ջ��
 * ���� min��push �� pop ��ʱ�临�Ӷȶ��� O (1)��
 * ά������ջ��һ��ջ�����������ݣ���һ��ջ���浱ǰ���ݶ�Ӧ����Сֵ
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
