package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 18:38 2021/8/24
 * @Description:
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
        System.out.println("target值是否存在：" + findNumberIn2DArray(matrix, target));
    }

}
