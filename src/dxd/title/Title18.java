package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 19:10 2021/8/25
 * @Description:
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 **/

public class Title18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNode cur = head;
        while(cur.next!=null&&cur.next.val!=val){
            cur = cur.next;
        }
        if(cur.next.val == val){
            cur.next = cur.next.next;
        }
        return head;

    }
}
