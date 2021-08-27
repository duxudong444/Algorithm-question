package dxd.title;

import java.util.Stack;

/**
 * @author: Xudong Du
 * @Date: Create in 8:49 2021/8/25
 * @Description:
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 **/

public class Title09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Title09() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    public void appendTail(int value){
        stack1.push(value);
        System.out.println(stack1.peek());
    }
    public int deleteHead(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return -1;
            }else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }
        return stack2.pop();



    }

    public static void main(String[] args) {
        Title09 temp = new Title09();
//        temp.appendTail(10);
//        temp.appendTail(12);
        int a = temp.deleteHead();
        int b = temp.deleteHead();
        int c = temp.deleteHead();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
