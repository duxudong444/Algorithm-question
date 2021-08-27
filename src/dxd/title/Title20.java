package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 17:43 2021/8/26
 * @Description:
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * ������ֵ�о����£�
 * ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123", ".2"]
 * ���ַ���ֵ�о����£�
 * ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]
*/

public class Title20 {
    //������ʽ����
    public static boolean isNumber(String s) {
        //�ж�s�Ƿ�δ��
        if(s.length() <= 0 || s == null){
            return false;
        }
        s = s.trim();
        //������ʽ������
        //[+-]?��ʾ��һ�����ڣ����Ǵ��ڿ϶���+-�������
        // \\d* * �Ŵ���ǰ����ַ����Բ����֣�Ҳ���Գ���һ�λ��߶��
        // (\\.\\d+)�� ��ʾ���Բ����֣����߳���һ�Σ�������ʽ��������.�������һ������
        //[(eE][+-]?\\d+)?����ʾ���Բ����ֻ��߳���һ�Σ�eE���+-���Բ����ֻ��߳���һ�Σ����Ǻ�����������������
        //return new String(s).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");�޷������e9
        return new String(s).matches("[+-]?((\\d+)|(\\d*\\.\\d+)|(\\d+\\.\\d*))([eE][+-]?\\d+)?");

    }

    public static void main(String[] args) {
        String s1 = "12e";
        String s2 = "1.e1";
        String s3 = null;
        System.out.println(isNumber(s2));
    }




}
