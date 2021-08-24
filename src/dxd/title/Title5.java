package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 18:50 2021/8/24
 * @Description:
 * ��ʵ��һ�����������ַ��� s �е�ÿ���ո��滻�� "%20"��
 * ���룺s = "We are happy."
 * �����"We%20are%20happy."
 **/

public class Title5 {
    public static String replaceSpace(String s) {
        if(s.length() == 0) return null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a == ' ') {
                sb.append("20%");
            }else{
                sb.append(a);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "We are happy. ";
        System.out.println("�滻����ַ����ǣ�" + replaceSpace(s));

    }

}
