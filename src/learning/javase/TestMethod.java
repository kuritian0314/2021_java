package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/6/22 12:44
 * @Version V1.0
 */
public class TestMethod {
    public static void main(String[] args) {
        TestMethod.run();
        TestMethod testMethod = new TestMethod();
        String s = testMethod.exec(3);
        System.out.println(s);

    }

    static void run()  {
        System.out.println("哈哈哈哈");
    }

    public String exec(int i) {
        if (i == 1) {
            return "正确";
        }
        return "错误";
    }

}
