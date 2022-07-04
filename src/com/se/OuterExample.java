package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/2/22 16:05
 * @Version V1.0
 */
public class OuterExample {
    private int age = 12;

    class Inner {
        private int age = 13;

        public void print() {
            int age = 14;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + OuterExample.this.age);
        }
    }

    public static void main(String[] args) {
        OuterExample.Inner in = new OuterExample().new Inner();
        in.print();
    }
}
