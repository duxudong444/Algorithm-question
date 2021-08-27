package dxd.title;

/**
 * @author: Xudong Du
 * @Date: Create in 17:43 2021/8/26
 * @Description:
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 部分数值列举如下：
 * ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123", ".2"]
 * 部分非数值列举如下：
 * ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]
*/

public class Title20 {
    //正则表达式做法
    public static boolean isNumber(String s) {
        //判断s是否未空
        if(s.length() <= 0 || s == null){
            return false;
        }
        s = s.trim();
        //下面表达式含义是
        //[+-]?表示不一定存在，但是存在肯定是+-两种情况
        // \\d* * 号代表前面的字符可以不出现，也可以出现一次或者多次
        // (\\.\\d+)？ 表示可以不出现，或者出现一次，但是形式，必须是.后面跟着一个整数
        //[(eE][+-]?\\d+)?，表示可以不出现或者出现一次，eE后的+-可以不出现或者出现一次，但是后面必须跟着若干整数
        //return new String(s).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");无法区别出e9
        return new String(s).matches("[+-]?((\\d+)|(\\d*\\.\\d+)|(\\d+\\.\\d*))([eE][+-]?\\d+)?");

    }

    public static void main(String[] args) {
        String s1 = "12e";
        String s2 = "1.e1";
        String s3 = null;
        System.out.println(isNumber(s2));
    }




}
