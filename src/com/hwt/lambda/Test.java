package com.hwt.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * create by weihua on 2022/3/22
 */
public class Test {
    public static void main(String[] args) {
/*        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() != 0;
            }
        };*/

      /*  Predicate<String> predicate = s -> s.length() != 0;
        boolean b = predicate.test("");
        System.out.println(b);*/
/*
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> s.isEmpty();
        Predicate<String> shortThan5 = s -> s.length() < 5;

        Predicate<String> p = nonNull.or(nonEmpty).and(shortThan5);
        Boolean b = p.test("abcde");
        System.out.println(b);*/

        Supplier<List<String>> newListOfStrings = () -> new ArrayList<>();
        Supplier<List<String>> newListOfStrings1 = ArrayList::new;
        List<String> a = newListOfStrings.get();
        List<String> b = newListOfStrings1.get();
        System.out.println(a);
        System.out.println(b);


//        new Thread(() -> System.out.println("我是一个线程！！")).start();

/*        BiConsumer<Random, Integer> randomNumberPrinter =
                ((random, number) -> {
                    for (int i = 0; i < number; i++) {
                        System.out.println("next random = " + random.nextInt());
                    }
                });
        randomNumberPrinter.accept(new Random(314L), 5);*/

      /*  BiFunction<String, String, Integer> findWordInSentence =
                (word, sentence) -> sentence.indexOf(word);
        Integer i = findWordInSentence.apply("34", "12334456");
        System.out.println(i);*/

     /*   BiFunction<String, Integer, String> findWordInSentence =
                (word, sentence) -> word.substring(sentence);
        String str = findWordInSentence.apply("abcd", 2);
        System.out.println(str);*/

  /*      BiFunction<String, String, Boolean> findWordInSentence =
                String::contains;
        Boolean b = findWordInSentence.apply("abcd", "abc444");
        System.out.println(b);*/

/*        Predicate<Integer> predicate = s -> s >= 10;
        boolean b1 = predicate.test(9);
        System.out.println(b1);*/

    }
}
