package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 11:12
 * @Version V1.0
 */
public class Test_06 {
    public static final String A = "123";
    public static final String B;
    public static int C = 0;
    //静态块，在类加载时就已经分配了内存空间并赋初值
    static {
        B = "456";
        s = A + B;
    }
    //静态变量
    static String s;

    public static void main(String[] args) {
        System.out.println(s == "123456");

        String s = A + "456";
        System.out.println(s == "123456");

        C = 1;
        System.out.println(C);
    }
}
