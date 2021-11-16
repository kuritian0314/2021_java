package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2021/11/3 21:36
 * @Version V1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer a1 = new Integer(123);
        int a2 = new Integer(123);
        Integer a3 = new Integer(123);
        Integer a4 = 123;
        int a5 = 123;
        //int基本类型和Integer包装类型使用==比较时，Integer类型会使用Integer.intValue()方法进行拆箱，比较的是int型的数值。
        System.out.println(a1 == a2);//T
        System.out.println(a1 == a3);//F
        System.out.println(a1 == a4);//F
        System.out.println(a1 == a5);//T
        System.out.println(a2 == a4);//T
    }
}
