package dxd.title;

import java.util.Arrays;

/**
 * @author: Xudong Du
 * @Date: Create in 18:56 2021/8/25
 * @Description:
 * �������� n����˳���ӡ���� 1 ������ n λʮ���������������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999��
 **/

public class Title17 {
    //�����Ǵ������⣬�� �����Ǵ������⣬��������Ҫ������ת���ַ������������Ȼ��ȫ�����ַ����ĵ� 0 λ���� n-1 λ��

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
        System.out.println("��ӡ����Ϊ��" + Arrays.toString(printNumbers(n)));
    }
}

