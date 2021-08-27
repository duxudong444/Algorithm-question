package dxd.title;

import dxd.usedClass.ListNode;

/**
 * @author: Xudong Du
 * @Date: Create in 18:41 2021/8/26
 * @Description:
 * ����һ����������������е����� k ���ڵ㡣
 * Ϊ�˷��ϴ�����˵�ϰ�ߣ������ 1 ��ʼ�������������β�ڵ��ǵ����� 1 ���ڵ㡣
 * ���磬һ�������� 6 ���ڵ㣬��ͷ�ڵ㿪ʼ�����ǵ�ֵ������ 1��2��3��4��5��6���������ĵ����� 3 ���ڵ���ֵΪ 4 �Ľڵ㡣
 * ʹ�ÿ���ָ�룬˫ָ����������Ӧ�úܹ㷺
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
