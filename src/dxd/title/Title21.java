package dxd.title;

import java.util.Arrays;

/**
 * @author: Xudong Du
 * @Date: Create in 18:15 2021/8/26
 * @Description:
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
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
