package com.shejimoshi.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author curry
 * @package com.shejimoshi.lambda
 * @date 2022/4/25 2:03
 * @Version V1.0
 */
public class Java8Test7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "b", "", "c", "d", "e", "e", "");
        //list.forEach(System.out::println);

        //list去除重复元素
        //list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        //list去除空元素
        //list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);

        //迭代器去除重复元素
        //list.stream().distinct().iterator().forEachRemaining(System.out::println);

        //for循环去除空元素
        //for (String s : list) {
        //    if (s.isEmpty()) {
        //        continue;
        //    }
        //    System.out.println(s);
        //}

    }
}
