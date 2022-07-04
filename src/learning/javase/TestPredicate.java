package learning.javase;

import java.util.function.Predicate;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/6/22 21:24
 * @Version V1.0
 */
public class TestPredicate {
    public static void main(String[] args) {
        //测试Predicate
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
    }
}
