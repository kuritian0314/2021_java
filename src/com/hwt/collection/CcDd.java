package com.hwt.collection;

/**
 * @author curry
 * @package com.hwt.collection
 * @date 2022/1/14 16:29
 * @Version V1.0
 */
public class CcDd {
    public static String output = "";

    public static String foo(int i) {
        try {
            if (i == 1) {
                throw new Exception();
            }
            output += "1";
            return output;
        } catch (Exception e) {
            output += "2";
//            return "有异常!!!";
        } finally {
            output += "3";
            return output = "4";

        }
//        output += "4";
//        return output;
    }

    public static void main(String[] args) {
        foo(0);
//        foo(1);
        System.out.println(output);
    }
}
