package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2021/11/3 20:49
 * @Version V1.0
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(method());
    }

    private static int method() {
        int num = 0;
        try {
            num = 5 / num;
            return num;
        } catch (Exception e) {
            return ++num;
        } finally {
            return num++;
        }
    }
}
