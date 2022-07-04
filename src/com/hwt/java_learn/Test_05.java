package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 11:02
 * @Version V1.0
 */
public class Test_05 {
    public static void main(String[] args) {
        Integer a1 = new Integer(123);
        int a2 = new Integer(123);
        Integer a3 = new Integer(123);
        Integer a4 = 123;
        int a5 = 123;
        int a6 = 129;
        Integer a7 = new Integer(129);
        //java中是值传递！！！
        //基本数据类型的包装类型，在与基本数据类型比较时，会自动拆箱成基本数据类型值，基本数据类型==比较的是两个数的值！！！
        System.out.println(a1 == a2);//true
        System.out.println(a1 == a3);//false
        System.out.println(a1 == a4);//false
        System.out.println(a1 == a5);//true
        System.out.println(a2 == a4);//true
        System.out.println(a6 == a7);
    }
}
