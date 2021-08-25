package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 14:05 2021/8/25
 * @Description:
 * 地上有一个 m 行 n 列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外）
 * 也不能进入行坐标和列坐标的数位之和大于 k 的格子。
 * 例如，当 k 为 18 时，机器人能够进入方格 [35, 37] ，因为 3+5+3+7=18。
 * 但它不能进入方格 [35, 38]，因为 3+5+3+8=19。
 * 请问该机器人能够到达多少个格子？
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 */


public class Title13 {
    static boolean[][] visited;
    public static int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        //回溯法递归，从0，0开始
        int result = dfs(0,0,m,n,k);
        return result;
    }

    private static int dfs(int i, int j, int m, int n, int k) {
        //计算所在位的数位之和
        int a = sum(i);
        int b = sum(j);
        //终止条件
        if(i<0 || i>m-1 || j<0 || j>n-1 || visited[i][j] || k<a+b){
            return 0;
        }
        //递归开始，需要加上当前所在位置，也就是+1
        visited[i][j] = true;
        return 1+ dfs(i+1,j,m,n,k) + dfs(i,j+1,m,n,k);

    }

    private static int sum(int x) {
        int s = 0;
        while (x!=0){
            s = s+x%10;
            x = x/10;
        }
        return s;
    }


    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int k = 1;
        System.out.println("机器人能够对到达的格子数为：" + movingCount(m,n,k));

    }
}
