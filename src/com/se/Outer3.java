package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/2/22 15:58
 * @Version V1.0
 */
public class Outer3 {

/*    private void test(final int i) {
        new Service() {
            public void method() {
                for (int j = 0; j < i; j++) {
                    System.out.println("匿名内部类" );
                }
            }
        }.method();
    }*/

    private void test(final int i) {
        ((Service) () -> {
            for (int j = 0; j < i; j++) {
                System.out.println("匿名内部类");
            }
        }).method();
    }

        public static void main (String[] args){
            Outer3 outer3 = new Outer3();
            outer3.test(3);
        }
    }

    //匿名内部类必须继承或实现一个已有的接口
    interface Service {
        void method();
    }



