package com.hwt.java_learn;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 10:50
 * @Version V1.0
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //Set集合本身是无序的且不能有重复元素，但LinkedHashSet是以元素插入到集合中的顺序排序的！
        Set<String> set = new LinkedHashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("aa");
        set.add("bb");
        set.add("dd");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());//aa bb cc
        }
    }
}
