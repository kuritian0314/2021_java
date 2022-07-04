package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 10:43
 * @Version V1.0
 */
public class Test_01 {
    public static void main(String[] args) {
        String x = "java";
        String y = "java";
        String z = new String("java");
        System.out.println(x == y);//true
        System.out.println(x == z);//false
        System.out.println(x.equals(y));//true
        System.out.println(x.equals(z));//true
    }
}
