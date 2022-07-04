package com.hwt.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author curry
 * @package com.hwt.sort
 * @date 2022/1/5 11:28
 * @Version V1.0
 */
public class TestSort {
    public static void main(String[] args) {
        ArrayList<Entity> list = new ArrayList<Entity>();
        list.add(new Entity("李四", 24));
        list.add(new Entity("张三", 13));
        list.add(new Entity("王五", 25));
        System.out.println("排序前：" + list);
        Long count = list.stream().count();
        System.out.println(count);
//        Collections.sort(list);
//        System.out.println("排序后：" + list);

        List<Entity> entityList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("排序后：" + entityList);
        Long count1 = list.stream().count();
        System.out.println(count1);

    }
}
