package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 12:13 2021/8/25
 * @Description:
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为 1。
 *
 **/

public class Title11 {
    public static int minArray(int[] numbers) {
        if(numbers.length == 0) return -1;
        int length = numbers.length;
        int head = 0;
        int tail = length-1;
        if(numbers[tail] > numbers[head])
            return numbers[head];
        while(tail - head >0){
            int mid = head + (tail-head)/2;
            if(numbers[mid] < numbers[tail]){
                tail = mid;
            }else if (numbers[mid] == numbers[tail]){
                tail--;
            }else{
                head = mid + 1;
            }

        }
        return numbers[head];
    }

    public static void main(String[] args) {
        int[] test = {10,1,1,1,2,3,4,5};
        System.out.println("旋转数组的最小值是" + minArray(test));
    }
}
