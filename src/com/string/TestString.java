package com.string;

/**
 * @author curry
 * @package com.string
 * @date 2022/3/6 15:59
 * @Version V1.0
 */

/**
 * 字符串的格式化，使用valueOf替代toString，valueOf底层仍然是使用toString方法，但是不会报空指针异常。
 *
 *
 */
public class TestString {
    public static void main(String[] args) {
        String a = "123";
        int b = Integer.parseInt(a);
        System.out.println(b);

//        String empId2 = "2001";
//
//        Integer integerEmpId2 = Integer.valueOf(empId2);
//        System.out.println(integerEmpId2);
//
//        Integer i = 123;
//        String str = String.valueOf(i);
//        System.out.println(str);
//
//        Double d = 120.1;
//        String str1 = String.valueOf(d);
//        System.out.println(str1);

        Long id = 123456789L;
        String str = String.valueOf(id);
        StringBuilder sb = new StringBuilder();

        if (str.length() <= 6) {
            sb.append(String.format("%06d", id));
        } else {
            sb.append(str.substring(str.length() - 6));
        }
        System.out.println(sb.toString());
    }
}
