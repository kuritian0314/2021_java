package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2021/11/3 21:43
 * @Version V1.0
 */
public class Demo2 {
    public static final String A = "123";
    public static final String B;

    static {
        B = "456";
        s = A + B;
    }

    static String s;

    public static void main(String[] args) {
        //1、A是常量，B是静态变量，A + B赋值给S底层是new StringBulider(Buffer)拼接创建新对象，赋值给静态变量S，不指向常量池
        //2、新定义局部变量S编译器完成字符串拼接，指向常量池
        System.out.println(s == "123456");//F

        String s = A + "456";
        System.out.println(s == "123456");//T
    }

}
