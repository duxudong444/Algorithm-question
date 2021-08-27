package dxd.title;

import java.util.Stack;

/**
 * @author: Xudong Du
 * @Date: Create in 21:34 2021/8/27
 * @Description:
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * ���磬���� {1,2,3,4,5} ��ĳջ��ѹջ���У�
 * ���� {4,5,3,2,1} �Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * �� {4,3,5,1,2} �Ͳ������Ǹ�ѹջ���еĵ������С�
 *
 * ����һ������ջ����ѹջ���е�ֵ��һѹջ��ȥ����������ջջ������ֵ�͵������е�ֵһһ�Ƚϣ�����򵯳�������ȼ���ѹջ��ֱ�����
 * ���ѹջ��ȥ��û��ȫ��������˵������ƥ��
 **/

public class Title31 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0 && popped.length == 0) return true;
        if(pushed.length != popped.length) return false;
        Stack<Integer> assisted = new Stack<>();
        //ָ�򵯳�����
        int j=0;
        for(int i=0; i<pushed.length; i++){
            assisted.push(pushed[i]);
            while(!assisted.isEmpty() && assisted.peek() == popped[j]){
                assisted.pop();
                j++;
            }
        }
        //���Ϊ�գ���˵��ƥ�䣬����ture
        return assisted.isEmpty();

    }

    public static void main(String[] args) {
        int[] pushed = {};
        int[] popped = {};
        System.out.println(validateStackSequences(pushed,popped));
    }
}
