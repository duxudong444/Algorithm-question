package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 8:48 2021/8/27
 * @Description:
 * ����������������������ϲ�����������ʹ�������еĽڵ���Ȼ�ǵ��������
 * ���룺1->2->4, 1->3->4
 * �����1->1->2->3->4->4
 **/

public class Title25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(-1);
        ListNode cur = newNode;
        while (l1!=null && l2 != null){
            if(l1.val <= l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }else{
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }

        }
        if(l1!=null){
            cur.next = l1;

        }
        if(l2!=null){
            cur.next = l2;

        }
        return newNode.next;


    }
}
