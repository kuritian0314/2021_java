package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 10:56
 * @Version V1.0
 */
public class Test_04 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method() {
        int num = 0;
        try {
            num = 5 / num;
            return num;
        } catch (Exception e) {
            return num++;//1
        } finally {
//            return ++num;//2，finally中的return语句会覆盖try或catch中的return语句
            System.out.println(num);//1，打印catch中的return值
        }
    }
}
