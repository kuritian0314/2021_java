package com.hwt;

/**
 * @author curry
 * @package com.hwt
 * @date 2021/10/20 17:40
 * @Version V1.0
 */
public class TestClassCast {
    public static void main(String[] args) {
//        Integer a = null;
//        String b = a.toString();
        Object a = null;
//        String b = String.valueOf(a);
//        String b = a.toString();
        String b = (String)a;
        System.out.println(b);
    }
}
