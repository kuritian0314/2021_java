package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 2:57
 * @Version V1.0
 */
public class TestThread {
    //匿名类实现多线程
    //public static void main(String[] args) {
    //    new Thread(() -> System.out.println("hello world")).start();
    //}
    //创建多线程
    public static void main(String[] args) {
        //new Thread(new Runnable() {
        //    @Override
        //    public void run() {
        //        System.out.println("hello world");
        //    }
        //}).start();

        new Thread(() -> System.out.println("hello world")).start();
    }

}

