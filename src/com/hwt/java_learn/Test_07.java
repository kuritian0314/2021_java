package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2021/12/10 11:22
 * @Version V1.0
 */
public class Test_07 {
    String str = new String("java");
    char[] arr = {'a', 'p', 'p'};

    public static void main(String[] args) {
        Test_07 test_07 = new Test_07();
        test_07.change(test_07.str, test_07.arr);

        System.out.println(test_07.str);//java，String是final修饰的，一旦确定，不可更改，任何对String的操作都是创建新的字符串的过程。
        System.out.println(test_07.arr);//apa

    }

    public void change(String str, char[] arr) {
        str = "oop";
        arr[2] = 'a';
    }

}
