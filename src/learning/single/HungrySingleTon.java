package learning.single;

/**
 * @author curry
 * @package learning.single
 * @date 2022/6/28 2:37
 * @Version V1.0
 */
public class HungrySingleTon {
    private static HungrySingleTon instance = new HungrySingleTon();

    private HungrySingleTon() {

    }

    public static HungrySingleTon getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungrySingleTon singleTon1 = new HungrySingleTon();
        HungrySingleTon singleTon2 = new HungrySingleTon();

        System.out.println(singleTon1.equals(singleTon2));
        //System.out.println(singleTon2);
        System.out.println(HungrySingleTon.getInstance());
    }
}
