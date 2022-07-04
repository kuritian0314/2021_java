package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 2:37
 * @Version V1.0
 */
public class TestInnerClass {
    private int a = 1;

    public void test() {
        class InnerClass {
            private int b = 2;

            public void test() {
                System.out.println(a);
                System.out.println(b);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.test();
    }

    public static void main(String[] args) {
        TestInnerClass testInnerClass = new TestInnerClass();
        testInnerClass.test();
    }

}
