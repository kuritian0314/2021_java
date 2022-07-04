package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2022/1/14 19:26
 * @Version V1.0
 */
public class Test {
    private String name = "abc";

    public static void main(String[] args) {
        Test test = new Test();
        Test testB = new Test();
        String result = test.equals(testB) + ",";
        result += test.name.equals(testB.name) + ",";
        result += test.name == testB.name;
        System.out.println(result);//false, true, true
    }
}
