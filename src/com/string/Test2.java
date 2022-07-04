package com.string;

/**
 * @author curry
 * @package com.string
 * @date 2022/3/15 2:18
 * @Version V1.0
 */
public class Test2 {
    public static int num = 1;

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int result;
        result = num();

        System.out.println(result);//结果不受finally影响，输出4
        System.out.println(num);//5

        int result1;
        result1 = test2.num1();

        System.out.println(result1);
        System.out.println(num);
    }

    private static int num() {
        try {
            int b = 4 / 0;
            return num = num + 2;
        } catch (Exception e) {
            return num = num + 3;
        } finally {
            ++num;
        }
    }

    private int num1() {
        try {
            int b = 4 / 0;
            return num = num + 2;
        } catch (Exception e) {
            return num = num + 3;
        } finally {
            ++num;
        }
    }
}
