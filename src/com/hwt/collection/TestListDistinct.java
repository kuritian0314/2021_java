package com.hwt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author curry
 * @package com.hwt.collection
 * @date 2022/1/9 12:24
 * @Version V1.0
 */
public class TestListDistinct {
    public static void main(String[] args) {
        List<Pig> list = new ArrayList<>();
        list.add(new Pig(1, "佩奇", 8));
        list.add(new Pig(1, "佩奇", 8));
        list.add(new Pig(2, "乔治", 4));
        list.add(new Pig(3, "佩奇爸爸", 30));
        list.add(new Pig(4, "佩奇妈妈", 28));
        list.add(new Pig(4, "佩奇妈妈", 28));

        List<Pig> newList = new ArrayList<>(list.size());
        list.forEach(i -> {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        });
        //打印集合
        newList.forEach(System.out::println);
        System.out.println("========================================================");
        List<Pig> distinctList = list.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);

    }
}
