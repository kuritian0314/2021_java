package learning.javase;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/5/16 3:34
 * @Version V1.0
 */
public class TestOptional {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(2);
        //Person p =Optional.ofNullable(person).get();
        //System.out.println(p.getAge());
        //System.out.println(p);
        //if (Optional.ofNullable(person).isPresent()){
        //    System.out.println("不为空");
        //}else {
        //    System.out.println("为空");
        //}
        //Optional<Person> optional =Optional.ofNullable(person).filter(p -> p.getAge()>50);
        //System.out.println(optional.get());
        //Optional.ofNullable(person).ifPresent(p -> System.out.println(p.getAge()));

        //Optional<String> optional = Optional.of("curry");
        //Optional<String> optional = Optional.of("");

        //Optional<String> optional = Optional.empty();
        //System.out.println("optional = " + optional.get());

        //Optional<String> optional1 = Optional.ofNullable(null);
        //System.out.println("optional1 = " + optional1.get());
        //Optional<String> optional2 = Optional.ofNullable("curry");
        //System.out.println("optional2 = " + optional2.get());

        Optional<Supplier<Person>> sup= Optional.ofNullable(Person::new);
        //调用get()方法，此时才会调用对象的构造方法，即获得到真正对象
        Person person1 = Optional.ofNullable(person).orElseGet(sup.get());
        System.out.println(person1);


        //System.out.println(optional.get());
        //System.out.println(optional.orElse("curry"));
        //System.out.println(optional.orElseGet(() -> "curry"));
        //System.out.println(optional.orElseThrow(() -> new RuntimeException("curry")));
        //System.out.println(optional.isPresent());
        //System.out.println(optional.map(String::toUpperCase).orElse("curry"));
        //System.out.println(optional.flatMap(s -> Optional.of(s.toUpperCase())).orElse("curry"));
        //System.out.println(optional.filter(s -> s.equals("curry")).orElse("curry"));
        //System.out.println(optional.filter(s -> s.equals("curry")).orElseGet(() -> "curry"));
        //System.out.println(optional.filter(s -> s.equals("curry")).orElseThrow(() -> new RuntimeException("curry")));
    }
}
