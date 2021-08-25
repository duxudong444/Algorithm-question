package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 9:07 2021/8/25
 * @Description:
 * дһ������������ n ����쳲�������Fibonacci�����еĵ� n ��� F(N)����쳲��������еĶ������£�
 *
 * F(0) = 0, F(1)= 1
 * F(N) = F(N - 1) + F(N - 2), ���� N > 1.
 * 쳲����������� 0 �� 1 ��ʼ��֮���쳲�������������֮ǰ��������Ӷ��ó���
 *����Ҫȡģ 1e9+7��1000000007����������ʼ���Ϊ��1000000008���뷵�� 1��
 **/

public class Title10 {

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        if(n < 0) return -1;
        if(n == 0)return f0;
        if(n == 1)return f1;
        int result = 0;
        for(int i = 1; i<n; i++){
            result = f0 + f1;
            f0 = f1 ;
            f1 = result;
        }
        System.out.println(result);
        result = result%1000000007;

        return result;

    }

    public static void main(String[] args) {

        System.out.println(fib(48));


    }
}
