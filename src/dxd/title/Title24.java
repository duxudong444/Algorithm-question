package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 18:59 2021/8/26
 * @Description:
 * ����һ������������һ�������ͷ�ڵ㣬��ת�����������ת�������ͷ�ڵ㡣
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
