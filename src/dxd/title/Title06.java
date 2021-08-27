package dxd.title;

import dxd.usedClass.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


/**
 * @author: Xudong Du
 * @Date: Create in 22:19 2021/8/24
 * @Description:
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
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
        System.out.println("逆序输出的数字为：" + Arrays.toString(reversePrint(node)));


    }

}
