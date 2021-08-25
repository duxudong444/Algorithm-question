package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 14:05 2021/8/25
 * @Description:
 * ������һ�� m �� n �еķ��񣬴����� [0,0] ������ [m-1,n-1] ��
 * һ�������˴����� [0, 0] �ĸ��ӿ�ʼ�ƶ�����ÿ�ο��������ҡ��ϡ����ƶ�һ�񣨲����ƶ��������⣩
 * Ҳ���ܽ�������������������λ֮�ʹ��� k �ĸ��ӡ�
 * ���磬�� k Ϊ 18 ʱ���������ܹ����뷽�� [35, 37] ����Ϊ 3+5+3+7=18��
 * �������ܽ��뷽�� [35, 38]����Ϊ 3+5+3+8=19��
 * ���ʸû������ܹ�������ٸ����ӣ�
 * ���룺m = 2, n = 3, k = 1
 * �����3
 * ���룺m = 3, n = 1, k = 0
 * �����1
 */


public class Title13 {
    static boolean[][] visited;
    public static int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        //���ݷ��ݹ飬��0��0��ʼ
        int result = dfs(0,0,m,n,k);
        return result;
    }

    private static int dfs(int i, int j, int m, int n, int k) {
        //��������λ����λ֮��
        int a = sum(i);
        int b = sum(j);
        //��ֹ����
        if(i<0 || i>m-1 || j<0 || j>n-1 || visited[i][j] || k<a+b){
            return 0;
        }
        //�ݹ鿪ʼ����Ҫ���ϵ�ǰ����λ�ã�Ҳ����+1
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
        System.out.println("�������ܹ��Ե���ĸ�����Ϊ��" + movingCount(m,n,k));

    }
}
