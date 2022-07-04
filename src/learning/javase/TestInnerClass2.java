package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 2:42
 * @Version V1.0
 */
public class TestInnerClass2 {
    //匿名内部类
    public void test() {
        new Thread() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
    }

    public static void main(String[] args) {
        TestInnerClass2 testInnerClass2 = new TestInnerClass2();
        testInnerClass2.test();
    }
}
