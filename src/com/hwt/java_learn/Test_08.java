package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 11:44
 * @Version V1.0
 */
public class Test_08 {
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        String c = a + b;//123123
        String d = "123" + "123";//123123
        String e = a + "123";

        System.out.println(c == d);//false，两个字符串的拼接是创建新的字符串，所以c、d两个新的字符串的地址是不一样的，为false！
        System.out.println(c.equals(d));//true，equals比较的是值，两个新的字符串的值都是"123123"，所以为true！
        System.out.println(c == e);//false
        System.out.println(c);//123123
        System.out.println(d);//123123
        System.out.println(d == e);//false
        System.out.println(d.equals(e));//true

        //String a = "123";
        //String b = new String("123");
        //String c = "123";
        //String d = c;
        //String e = b + "";
        //String f = a + "";
        //String j = "123" + "";
        //System.out.println(a == b);
        //System.out.println(a.equals(b));
        //System.out.println(a == c);
        //System.out.println(d == a);
        //System.out.println(e == b);
        //System.out.println(f == a);
        //System.out.println(f.equals(a));
        //System.out.println(j == a);
        //System.out.println(j.equals(a));

    }
}
