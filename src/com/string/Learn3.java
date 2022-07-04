package com.string;

/**
 * @author curry
 * @package com.string
 * @date 2022/3/15 1:37
 * @Version V1.0
 */
public class Learn3 {
    public static void main(String[] args) throws Exception {
        Learn3 learn3 = new Learn3();
        int i = learn3.test2();
        System.out.println(i);
    }

//    private void test() throws Exception {
//        try {
//            double d = 15 / 0;
//        } catch (Exception e) {
//            throw new Exception("除数不能为0");
//        }
//    }

    private int test2() {
        int i1 = 1;

        try {
             int i2 = i1++;
             return i2;
        } catch (Exception e) {
            int i3 = i1++;
        } finally {
//            return i1 + 3;
//            System.out.println(i1);
            return ++i1;
        }

    }
}
