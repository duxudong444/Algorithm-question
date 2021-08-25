package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 9:07 2021/8/25
 * @Description:
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 *
 * F(0) = 0, F(1)= 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
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
