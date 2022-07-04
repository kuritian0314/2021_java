package learning.shejimoshi;

/**
 * @author curry
 * @package learning.shejimoshi
 * @date 2022/4/9 2:44
 * @Version V1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.createChain();
        applicationContext.handleRequest("30");
        applicationContext.handleRequest("60");
        applicationContext.handleRequest("90");
    }
}
