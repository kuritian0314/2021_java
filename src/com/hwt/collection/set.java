package com.hwt.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    @Test
    public void test() {
        HashSet<String> set=new HashSet<String>();
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new String("bbc"));
        set.add(new String("bbb"));

        for (String s : set) {
            System.out.println(s);
        }
    }

    @Test
    public void test1() {
        Set<String> set1 = new HashSet<String>();
        set1.add(new String("abc"));
        set1.add(new String("abc"));
        set1.add(new String("abc"));
        set1.add(new String("bbc"));
        set1.add(new String("bbb"));

        Iterator it = set1.iterator();
        while (it.hasNext()) {
//            String str = (String) it.next();
            Object o = (Object) it.next();
            System.out.println(o);
        }

    }
    @Test
    public void test2() {
        Set<String> set1 = new HashSet<String>();
        set1.add(new String("abc"));
        set1.add(new String("abc"));
        set1.add(new String("abc"));
        set1.add(new String("bbc"));
        set1.add(new String("bbb"));

        //使用lambda遍历Set
        System.out.println("=========3.使用lambda遍历Set集合(一)===========");
        set1.forEach(n->System.out.println(n));
        //使用lambda遍历Set
        System.out.println("=========3.使用lambda遍历Set集合(二)===========");
        set1.forEach(System.out::println);

    }

}
