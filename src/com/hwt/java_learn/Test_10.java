package com.hwt.java_learn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 11:57
 * @Version V1.0
 */
public class Test_10 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        System.out.println(a.getClass() == b.getClass());
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
    }
}
