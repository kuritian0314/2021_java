package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/7/7 17:41
 * @Version V1.0
 */
public class TestMethod {
    public static void main(String[] args) {
        TestMethod testMethod = new TestMethod();
        String s1 = TestMethod.staticMethod(1);
        System.out.println("s1 = " + s1);

        String s2 = testMethod.method(2);
        System.out.println("s2 = " + s2);

    }

    public String method(Integer id) {
        return "curry";
    }

    public static String staticMethod(Integer id) {
        return "green";
    }
}
