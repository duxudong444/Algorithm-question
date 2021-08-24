package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 18:12 2021/8/24
 * @Description:��ָ Offer 03. �������ظ�������
 * �Ѷȼ�
 * �ҳ��������ظ������֡�
 * ��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�
 * ������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
 * ����[2,3,1,0,2,5,3]���2����3����
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
        System.out.println("�����ظ���һ�������ǣ�" + findNumber(nums) );
    }
}
