package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 18:50 2021/8/24
 * @Description:
 * 请实现一个函数，把字符串 s 中的每个空格替换成 "%20"。
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
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
        System.out.println("替换后的字符串是：" + replaceSpace(s));

    }

}
