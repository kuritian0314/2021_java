package com.se;

/**
 * @author curry
 * @package com.se
 * @date 2022/2/22 15:54
 * @Version V1.0
 */
public class Outer2 {

    private static int radius = 1;
    private int count = 2;

    class Inner {
        public void visit() {
            System.out.println("visit outer static  variable: " + radius);
            System.out.println("visit outer   variable: " + count);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
//        Outer2 outer = new Outer2();
//        Outer2.Inner inner = outer.new Inner();
        Outer2.Inner inner = new Outer2().new Inner();
        inner.visit();


    }
}
