package dxd.title;

import java.util.Arrays;

/**
 * @author: Xudong Du
 * @Date: Create in 18:15 2021/8/26
 * @Description:
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ����������λ�������ǰ�벿�֣�����ż��λ������ĺ�벿�֡�
 **/

public class Title21 {
    public static int[] exchange(int[] nums) {
        if(nums.length <= 0 || nums == null){
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right > left){
            if((nums[left]&1) == 1){
                left++;
            }else if((nums[right]&1) == 0){
                right--;
            }else{
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return nums;



    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,121,456,111};
        int[] nums3 = new int[0];
        System.out.println(Arrays.toString(exchange(nums1)));
        System.out.println(Arrays.toString(exchange(nums3)));

    }
}
