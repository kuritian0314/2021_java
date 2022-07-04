package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 2:45
 * @Version V1.0
 */
public class TestEmum {
    public static void main(String[] args) {
        //枚举类型的实例化
        ColorEnum colorEnum = ColorEnum.RED;
        System.out.println(colorEnum.getName());

        //枚举类型的获取
        System.out.println(ColorEnum.getColor(1));

        //枚举类型的遍历
        for (ColorEnum color : ColorEnum.values()) {
            System.out.println(color.getName());
        }
    }

}
