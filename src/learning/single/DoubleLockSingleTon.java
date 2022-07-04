package learning.single;

/**
 * @author curry
 * @package learning.single
 * @date 2022/6/28 2:52
 * @Version V1.0
 */
public class DoubleLockSingleTon {
    private volatile static DoubleLockSingleTon instance = null;

    private DoubleLockSingleTon() {

    }

    public static DoubleLockSingleTon getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleTon.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleTon();
                }
            }
        }
        return instance;
    }
}
