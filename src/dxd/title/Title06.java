package dxd.title;

import dxd.usedClass.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


/**
 * @author: Xudong Du
 * @Date: Create in 22:19 2021/8/24
 * @Description:
 * ����һ�������ͷ�ڵ㣬��β��ͷ����������ÿ���ڵ��ֵ�������鷵�أ���
 * ���룺head = [1,3,2]
 * �����[2,3,1]
 **/

public class Title06 {

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode cur = head;
        int i = 0;
        
        while(cur!=null){
            stack.push(cur);
            cur = cur.next;
            i++;
        }

        int[] nums = new int[i];
        for(int j=0; j<i; j++){
            nums[j] = stack.pop().val;
        }
        return nums;


    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(2);
        System.out.println("�������������Ϊ��" + Arrays.toString(reversePrint(node)));


    }

}
