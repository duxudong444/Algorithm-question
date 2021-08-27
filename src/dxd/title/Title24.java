package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 18:59 2021/8/26
 * @Description:
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 **/

public class Title24 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode newNode = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = newNode;
            newNode = cur;
            cur = temp;
        }
        return newNode;

    }

}
