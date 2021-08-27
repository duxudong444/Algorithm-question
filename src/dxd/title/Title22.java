package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 18:41 2021/8/26
 * @Description:
 * 输入一个链表，输出该链表中倒数第 k 个节点。
 * 为了符合大多数人的习惯，本题从 1 开始计数，即链表的尾节点是倒数第 1 个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * 使用快慢指针，双指针在链表中应用很广泛
 **/

public class Title22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while(k>0&&fast.next!=null){
            fast = fast.next;
            k--;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;



    }
}
