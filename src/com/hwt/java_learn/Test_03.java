package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 10:54
 * @Version V1.0
 */
public class Test_03 {
    public static void main(String[] args) {
        String a = "12";
        String b = "1" + 2;
        String c = "1" + "2";
        String d = c;
        System.out.println(a == b);//true
        System.out.println(a.equals(b));//true
        System.out.println(a == c);//true
        System.out.println(b == d);//true
    }
}
