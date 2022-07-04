package learning.single;

/**
 * @author curry
 * @package learning.single
 * @date 2022/6/28 2:42
 * @Version V1.0
 */
public class LazySingleTon {
    private static LazySingleTon instance = null;

    private LazySingleTon() {

    }

    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance= new LazySingleTon();
        }
        return instance;
    }
}
