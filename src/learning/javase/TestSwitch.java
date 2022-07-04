package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 3:03
 * @Version V1.0
 */
public class TestSwitch {
    public static void main(String[] args) {
        //int i = 2;
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("i=0");
                break;
            case 1:
                System.out.println("i=1");
                break;
            default:
                System.out.println("i=default");
                break;
        }
    }
}
