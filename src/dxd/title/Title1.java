package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 18:12 2021/8/24
 * @Description:剑指 Offer 03. 数组中重复的数字
 * 难度简单
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 输入[2,3,1,0,2,5,3]输出2或者3即可
 **/

public class Title1 {
    public static int findNumber(int[] nums){
        if(nums.length == 0){return -1;}

        for(int i = 0; i < nums.length; i++){
            while (i != nums[i]){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,0,2,5,3};
        System.out.println("其中重复的一个数字是：" + findNumber(nums) );
    }
}
