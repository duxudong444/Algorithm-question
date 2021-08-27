package dxd.title;

import java.util.Arrays;

/**
 * @author: Xudong Du
 * @Date: Create in 11:50 2021/8/27
 * @Description:
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 **/

public class Title29 {
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return null;
        }
        int x = matrix[0].length;
        int y = matrix.length;
        int[] print = new int[x*y];
        int temp = 0;
        int top = 0;
        int down = y - 1;
        int right = x - 1;
        int left = 0;
        while(temp < x*y){
            for(int i = left; i<= right && temp < x*y; i++){
                print[temp++] = matrix[top][i];
            }
            top++;
            for(int i = top; i <= down && temp < x*y; i++){
                print[temp++] = matrix[i][right];
            }
            right--;
            for(int i = right; i >= left && temp < x*y; i--){
                print[temp++] = matrix[down][i];
            }
            down--;
            for(int i = down; i >= top && temp < x*y; i--){
                print[temp++] = matrix[i][left];
            }
            left++;

        }

        return print;


    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {4,5},
                {7,8}
        };
        System.out.println(Arrays.toString(spiralOrder(matrix)));

    }

}
