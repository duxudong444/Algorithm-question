package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 16:04 2021/8/25
 * @Description:
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 *
 **/

public class Title16 {
    /*public static double myPow(double x, int n) {
        if (n < 0) {
            int m = -n;
            double[] db1 = new double[m + 1];
            db1[1] = x;
            for (int i = 2; i <= m; i++) {
                db1[i] = db1[i - 1] * x;
            }
            return 1 / db1[m];
        }

        double[] db2 = new double[n + 1];
        db2[1] = x;
        for (int i = 2; i <= n; i++) {
            db2[i] = db2[i - 1] * x;
        }
        return db2[n];*/
    public static double myPow(double x, int n){
        if(x==0)return 0;
        long b = n;
        double result = 1.0;
        if(b<0){
            b = -b;
            x = 1/x;
        }
        while (b>0){
            //判断b是否为偶数和奇数的方法
            if((b&1)==1){
                result = result*x;
            }
            x = x*x;
            //b/2的代替
            b = b>>1;
        }
        return result;


    }

    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        System.out.println("计算得到的结果为：" + myPow(x,n));
    }
}
