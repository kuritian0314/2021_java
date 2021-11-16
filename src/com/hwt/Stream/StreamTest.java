package com.hwt.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author curry
 * @package com.hwt.Stream
 * @date 2021/10/18 14:07
 * @Version V1.0
 */
public class StreamTest {
    /**
     * 准备数据
     *
     * @param arr1
     * @param arr2
     */
    private static void prepare(ArrayList<String> arr1, ArrayList<Person> arr2) {
        Person p1 = new Person(6, "java  ", 1, false);
        Person p2 = new Person(7, " cat ", 3, true);
        Person p3 = new Person(8, " lee", 2, true);
        Person p4 = new Person(9, "javax", 3, false);
        Person p5 = new Person(10, "lmy", 3, true);
        Collections.addAll(arr1, "1.html", "2.html", "3.html", "lib", "99.html");
        Collections.addAll(arr2, p1, p2, p3, p4, p5);
    }

    public static void main(String[] args) {
        //准备数据
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Person> arr2 = new ArrayList<>();
        prepare(arr1, arr2);
        //、、、、、、、、、、、、、、、、、开始学习、、、、、、、、、、、、、、、、、、
        //首先需要了解，我们将集合转为流后，我们使用map方法操作，实际上是需要对集合中的每一个对象进行操作
        //map方法一共有两种使用方式 第一类是对于特殊方法简写的形式


        //第一类 集合中对象使用无参方法操作
        /*使用格式==> 集合对象.stream().map(T::method)*/
        //使用这个方法时 首先了解
        // 第一个参数T：stream流泛型的类型或者该泛型类型的父类
        // 第二个参数method：就是该类无参的方法
        // 返回值： 一个新的流对象，该流的泛型就是和该方法的返回值是一致的。
        // 详细如下面三个例子

        //01 第一个参数 String = 该流的泛型 String
        // 第二个参数 就是 String类中的 trim()方法【该方法是将字符串两边的空格去掉】 ，该方法的返回值是String 所以返回的流的泛型也是String
        //01效果：就是将集合元素都执行trim方法 后返回新的集合

        //1 集合-->Stream流-->处理逻辑-->转为新的Stream流
        Stream<String> stringStream = arr1.stream().map(String::trim);
        //2.Stream转为集合 collect该集合就是处理后的集合
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);

        //02  第一个参数 String = 该流的泛型 String
        // 第二个参数 就是 String类中的 length()方法 ，该方法的返回值是int 所以返回的流的泛型也是Integer
        Stream<Integer> stringStream2 = arr1.stream().map(String::length);
        List<Integer> collect2 = stringStream2.collect(Collectors.toList());
        System.out.println(collect2);
        //转回集合和01一致 这里省略

        //03 第一个参数 Objects 该类是String的父类 所以也是可以的
        // 第二个参数 就是 Objects类中的 isNull()方法 ，该方法的返回值是boolean 所以返回的流的泛型也是Boolean
        Stream<Boolean> booleanStream = arr1.stream().map(Objects::isNull);
        List<Boolean> collect3 = booleanStream.collect(Collectors.toList());
        System.out.println(collect3);
        //转回集合和01一致 这里省略


        //第二类 集合中对象使用有参方法操作
        /*使用格式==> 集合对象.stream().map(par->{})*/
        //使用这个方法时
        //第一个参数 pre 就是一个形参
        // 第二个{是对这个参数的操作} 这个{}里面是有返回值的 ，这个返回值是要自己return的
        //以下代码的效果是：
        // 将arr1集合首先转换为流 然后 打印每个集合中的值
        // 再然后 每个值后面都加一段“ssss”后返回一个新的流
   /*     Stream<String> stringStream1 = arr1.stream().map((pre) -> {
            System.out.println("pre = " + pre);
            pre = pre + "ssss";
            return pre;
        });
        List<String> collect4 = stringStream1.collect(Collectors.toList());
        System.out.println(collect4);*/

        //转回集合和01一致 这里省略

        /*return 有时也是可以省略的。也就是说 {}里面只有一行代码的时候 {}和return一块省略不写
         * 例如*/
        Stream<String> stringStream1 = arr1.stream().map((pre) ->
                pre = pre + "ssss"
        );
        List<String> collect5 = stringStream1.collect(Collectors.toList());
        System.out.println(collect5);

        //返回的流也是和第一类使用是一样的  return返回的是什么类型的 那么流泛型就是什么类型的
/*        Stream<Integer> s1 = arr1.stream().map((pre) -> {
            int s = pre.lastIndexOf("s");
            return s;
        });
        List<Integer> collect6 = s1.collect(Collectors.toList());
        System.out.println(collect6);*/
        List<Integer> collect6 = arr1.stream().map((pre) -> {
            int s = pre.lastIndexOf("s");
            return s;
        }).collect(Collectors.toList());
        System.out.println(collect6);

//    练习题

        //需求1.现有一个集合 arr2；arr2中存有五个person对象
        // 先需要将这五个对象的名字单独放入一个集合中

        Stream<String> stringStream3 = arr2.stream().map(Person::getName);
        List<String> nameList = stringStream3.collect(Collectors.toList());
//        System.out.println("nameList = " + nameList);

        //最简写的方法 这就是链式编程
        List<String> nameList2 = arr2.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("nameList2 = " + nameList2);

//        需求2 现有一个集合 arr2；arr2中存有五个person对象
        //需要将该集合中的对象年龄都改为18岁 名字如果不是lmy都改为java
        Stream<Person> personStream = arr2.stream().map((pre) -> {
            pre.setAge(18);
            if (pre.getName() != "lmy") {
                pre.setName("java");
            }
            return pre;
        });
        List<Person> personList = personStream.collect(Collectors.toList());
        System.out.println("personList = " + personList);
        //需求3 先有一个用于存放字符串的集合arr1；
        // 第一步 先需要将该集合以.html结尾的元素 筛选出来，
        // 然后对其进行处理 将.html截取掉 ;例如 该字符串为lee.html ==> lee

        List<String> StringList = arr1.stream().map((str) -> {

            if (str.endsWith("html")) {
                return str.replace(".html", "").trim();
            } else {
                return null;
            }
        }).collect(Collectors.toList());

        System.out.println(StringList); //[1, 2, 3, null, 99]
        /*
         * 这里需要注意的是 返回的集合 第四个元素存的是null
         * 但是我们最终需要的集合应该是[1, 2, 3, 99]，
         * 为了解决这一类问题 我们可以使用stream流中的另一个方法
         *
         * */

        //具体操作
        List<String> StringList2 = arr1.stream()
                .filter(str -> str.endsWith(".html"))
                .map((str) -> str.replace(".html", "").trim())
                .collect(Collectors.toList());
        System.out.println("StringList2 = " + StringList2);//[1, 2, 3, 99]
        //stream流filter该方法的使用 我将在另一个博客中讲述。

    }


}
