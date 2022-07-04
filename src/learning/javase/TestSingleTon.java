package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 2:58
 * @Version V1.0
 */
public class TestSingleTon {
    //静态内部类实现单例模式
    private static class SingletonHolder{
        private static TestSingleTon instance = new TestSingleTon();
    }

    private TestSingleTon(){}

    public static TestSingleTon getInstance(){
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        TestSingleTon testSingleTon = TestSingleTon.getInstance();
        System.out.println(testSingleTon);
    }

    //枚举实现单例模式
    //private enum SingletonHolder{
    //    INSTANCE;
    //    private TestSingleTon instance = new TestSingleTon();
    //}

    //private TestSingleTon(){}

    //public static TestSingleTon getInstance(){
    //    return SingletonHolder.INSTANCE.instance;
    //}
    //
    //public static void main(String[] args) {
    //    TestSingleTon testSingleTon = TestSingleTon.getInstance();
    //    System.out.println(testSingleTon);
    //}
}
