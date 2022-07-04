package com.shejimoshi.lambda;

/**
 * @author curry
 * @package com.shejimoshi.lambda
 * @date 2022/3/20 16:38
 * @Version V1.0
 */
public class Java8Tester1 {
    public static void main(String args[]) {
//        final int num = 1;
        int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
//        num = 5;
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
