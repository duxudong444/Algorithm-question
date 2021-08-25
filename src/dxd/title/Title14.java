package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 15:07 2021/8/25
 * @Description:
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n 都是整数，n>1 并且 m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。
 * 请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18。
 *递归的做法基本是错的，时间复杂度过大
 *
 **/

public class Title14 {
//    递归的做法基本是错的，时间复杂度过大
//    public static int cuttingRope(int n) {
//        if(n==1)return 1;
//        if(n==2)return 1;
//        int max = 1;
//        int temp = max;
//        for(int i=1; i<n; i++){
//            max = i * Math.max(cuttingRope(n-i),n-i);
//            if(temp<=max){
//                temp = max;
//            }
//        }
//        return temp;
//
//
//    }
    public static int cuttingRope(int n){
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
            for (int j = 1; j < i; j++)
                dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * (i - j));

        return dp[n];

    }

    public static void main(String[] args) {
        int n = 58;
        System.out.println(cuttingRope(n));
    }
}
