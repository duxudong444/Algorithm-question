package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 15:55 2021/8/25
 * @Description:
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数
 **/

public class Title15 {
    public static int hammingWeight(int n) {
        int res = 0;
        //把一个整数减去 1 之后再后原来的整数做位与运算，得到的结果相当于把整数的二进制表示中最右边的 1 变成 0。
        //因此，统计n变成0之前进行了多少次循环，就知道有多少个1了
        while(n!=0){
            res++;
            n&=n-1;
        }
        return res;

    }

    public static void main(String[] args) {
        int a = -3;
        System.out.println(a + "中有" + hammingWeight(a) + "个1");
        System.out.println(a + "中有" + Integer.bitCount(a) + "个1");
    }
}
