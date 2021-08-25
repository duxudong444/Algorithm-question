package dxd.title;

import java.util.Arrays;

/**
 * @author: Xudong Du
 * @Date: Create in 18:56 2021/8/25
 * @Description:
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 **/

public class Title17 {
    //不考虑大数问题，即 若考虑大数问题，则首先需要将数字转成字符串避免溢出，然后全排列字符串的第 0 位到第 n-1 位。

    public static int[] printNumbers(int n) {

        int num=0;
        for(int i = n; i > 0; i--){
            num = num*10+9;
        }
        int[] nums = new int[num];
        for(int i=0; i<num; i++){
            nums[i] = i+1;
        }
        return nums;

    }



    public static void main(String[] args) {
        int n = 0;
        System.out.println("打印出来为：" + Arrays.toString(printNumbers(n)));
    }
}

