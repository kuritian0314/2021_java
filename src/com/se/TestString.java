package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/7/7 17:56
 * @Version V1.0
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s1 + "def";
        String s4 = "abcdef";
        String s5 = "abc" + "def";

        System.out.println(s1.equals(s2));// true
        System.out.println(s1 == s2);// false
        System.out.println(s3.equals(s4));// true
        System.out.println(s3 == s4);// false
        System.out.println(s4.equals(s5));// true
        System.out.println(s4 == s5);// true
    }
}
