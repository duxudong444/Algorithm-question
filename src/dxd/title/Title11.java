package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 12:13 2021/8/25
 * @Description:
 * °ÑÒ»¸öÊı×é×î¿ªÊ¼µÄÈô¸É¸öÔªËØ°áµ½Êı×éµÄÄ©Î²£¬ÎÒÃÇ³ÆÖ®ÎªÊı×éµÄĞı×ª¡£
 * ÊäÈëÒ»¸öµİÔöÅÅĞòµÄÊı×éµÄÒ»¸öĞı×ª£¬Êä³öĞı×ªÊı×éµÄ×îĞ¡ÔªËØ¡£
 * ÀıÈç£¬Êı×é[3,4,5,1,2] Îª [1,2,3,4,5] µÄÒ»¸öĞı×ª£¬¸ÃÊı×éµÄ×îĞ¡ÖµÎª 1¡£
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
        System.out.println("Ğı×ªÊı×éµÄ×îĞ¡ÖµÊÇ" + minArray(test));
    }
}
