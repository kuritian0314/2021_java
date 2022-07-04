package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 10:48
 * @Version V1.0
 */
public class Test_02 {
    public static void main(String[] args) {
        int a = -10 % -3;
        int b = 10 % -3;
        //除法中，商的符号为正数还是负数取决于分子的符号！！！跟分母的符号无关
        System.out.println(a);//-1
        System.out.println(b);//1
    }
}
