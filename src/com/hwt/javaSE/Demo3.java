package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2021/11/4 14:41
 * @Version V1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab" + "c";
        System.out.println(s1 == s2);

        String s3 = "ab";
        String s4 = "abc";
        String s5 = s3 + "c";
        System.out.println(s4 == s5);
    }
}
