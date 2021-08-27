package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 18:38 2021/8/24
 * @Description:
 * ��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ����Ч�ĺ���������������һ����ά�����һ���������ж��������Ƿ��и�������
 *
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 *
 *
 **/

public class Title04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int i = 0;
        int j = matrix[0].length -1;
        while (i < matrix.length && j >= 0) {
            int a = matrix[i][j];
            if (target == a) return true;
            if (target < a) {
                j--;
            }
            if (target > a) {
                i++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}

        };
        int target = 0;
        System.out.println("targetֵ�Ƿ���ڣ�" + findNumberIn2DArray(matrix, target));
    }

}
