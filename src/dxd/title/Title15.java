package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 15:55 2021/8/25
 * @Description:
 * ��дһ��������������һ���޷����������Զ����ƴ�����ʽ��������������Ʊ��ʽ������λ��Ϊ '1' �ĸ���
 **/

public class Title15 {
    public static int hammingWeight(int n) {
        int res = 0;
        //��һ��������ȥ 1 ֮���ٺ�ԭ����������λ�����㣬�õ��Ľ���൱�ڰ������Ķ����Ʊ�ʾ�����ұߵ� 1 ��� 0��
        //��ˣ�ͳ��n���0֮ǰ�����˶��ٴ�ѭ������֪���ж��ٸ�1��
        while(n!=0){
            res++;
            n&=n-1;
        }
        return res;

    }

    public static void main(String[] args) {
        int a = -3;
        System.out.println(a + "����" + hammingWeight(a) + "��1");
        System.out.println(a + "����" + Integer.bitCount(a) + "��1");
    }
}
