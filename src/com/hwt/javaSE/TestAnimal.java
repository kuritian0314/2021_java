package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 20:09
 * @Version V1.0
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        animal.eat();
        animal1.eat();
        System.out.println(animal1.a);
        System.out.println(Dog.a);
        System.out.println(animal1.a);
    }
}
