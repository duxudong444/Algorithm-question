package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 12:13 2021/8/25
 * @Description:
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ����������������һ����ת�������ת�������СԪ�ء�
 * ���磬����[3,4,5,1,2] Ϊ [1,2,3,4,5] ��һ����ת�����������СֵΪ 1��
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
        System.out.println("��ת�������Сֵ��" + minArray(test));
    }
}
