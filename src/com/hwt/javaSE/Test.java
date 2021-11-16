package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2021/11/3 21:00
 * @Version V1.0
 */
public class Test {
    public static void main(String[] args) {
        int i = 0;
//        int a = i++;
        int b = ++i;
        System.out.println(i);//1
//        System.out.println(i);//1
//        System.out.println(a);//0
        System.out.println(b);//1
    }
}
