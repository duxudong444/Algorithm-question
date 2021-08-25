package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 19:10 2021/8/25
 * @Description:
 * �������������ͷָ���һ��Ҫɾ���Ľڵ��ֵ������һ������ɾ���ýڵ㡣
 * ����ɾ����������ͷ�ڵ㡣
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
