package com.hwt.danli;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author curry
 * @package com.hwt.danli
 * @date 2022/4/3 2:41
 * @Version V1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //Optional.ofNullable(null).orElse("");
        Optional<String> optional = Optional.ofNullable(null);
        String value = optional.orElse("123");
        System.out.println(value);

        Predicate<String> predicate = s -> s.length() > 0;
        System.out.println(predicate.test("123"));

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("123"));

        Supplier<String> supplier = () -> "123";
        System.out.println(supplier.get());

        Consumer<String> consumer = System.out::println;
        consumer.accept("123");
    }
}

