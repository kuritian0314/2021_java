package com.hwt.collection;

/**
 * @author curry
 * @package com.hwt.collection
 * @date 2022/1/14 14:20
 * @Version V1.0
 */
public class AaBb {
    //    String value1 = "dog", value2 = "cat", value3 = "pig";
//    private static final String[] options = {"dog", "cat", "pig", "duck"};

    public static void main(String[] args) {
//        String value = "egg";
//        if (value.equals("dog") || value.equals("cat") || value.equals("pig")) {
//            System.out.println("这些都是动物");
//        }
//        System.out.println("不是动物");
//        if (options.includes(value)) {
//        }
//        final String[] options = {"dog", "cat", "pig", "duck"};
//
//        for (String option : options) {
//            String value = "dog";
//            if (value.equals(option)) {
//                value = option;
//                System.out.println(value);
//            } else {
//                System.out.println("空指针异常");
//            }
//        }

        String s = "";
        for (char i = 'a'; i < 'd'; i++) {
//            s = s + i;
            s = i + s;
        }
        System.out.println(s);
    }
}
