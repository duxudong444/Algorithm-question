package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 15:07 2021/8/25
 * @Description:
 * ����һ������Ϊ n �����ӣ�������Ӽ����������ȵ� m �Σ�m��n ����������n>1 ���� m>1����
 * ÿ�����ӵĳ��ȼ�Ϊ k[0],k[1]...k[m-1] ��
 * ���� k[0]*k[1]*...*k[m-1] ���ܵ����˻��Ƕ��٣�
 * ���磬�����ӵĳ����� 8 ʱ�����ǰ������ɳ��ȷֱ�Ϊ 2��3��3 �����Σ���ʱ�õ������˻��� 18��
 *�ݹ�����������Ǵ�ģ�ʱ�临�Ӷȹ���
 *
 **/

public class Title14 {
//    �ݹ�����������Ǵ�ģ�ʱ�临�Ӷȹ���
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
