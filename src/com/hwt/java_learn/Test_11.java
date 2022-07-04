package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2022/1/14 19:22
 * @Version V1.0
 */
public class Test_11 {
    //成员变量，字符串一旦确定，不可更改！final类型的
    public String str = "6";

    public static void main(String[] args) {
        Test_11 test_11 = new Test_11();
        test_11.change(test_11.str);
        System.out.println(test_11.str);

    }

    private void change(String str) {
        str = "10";
    }
}
