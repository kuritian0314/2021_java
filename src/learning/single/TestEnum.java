package learning.single;

/**
 * @author curry
 * @package learning.single
 * @date 2022/6/28 1:56
 * @Version V1.0
 */
public class TestEnum {

    private enum singleHolder {
        INSTANCE;
        private static final TestEnum instance = new TestEnum();

    }

    public TestEnum() {

    }

    public static TestEnum getInstance() {
        return singleHolder.instance;
    }

    public static void main(String[] args) {
        TestEnum testEnum = TestEnum.getInstance();
        System.out.println(testEnum);
    }
}
