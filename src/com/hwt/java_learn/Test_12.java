package com.hwt.java_learn;

public class Test_12 {
    public static void main(String[] args) {
        //byte、short、char型运算时，结果都是int型
        //byte型进行运算时，会将结果返回成int型，所以需要强转成byte型
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        b6 = b4 + b5;//10
        b3 = (byte) (b1 + b2);//3
        System.out.println(b3 + b6);//13
    }
}
