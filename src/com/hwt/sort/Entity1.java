package com.hwt.sort;

/**
 * @author curry
 * @package com.hwt.sort
 * @date 2022/1/5 11:33
 * @Version V1.0
 */
public class Entity1 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Entity1(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entity1{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public int compareTo(Entity1 o) {
//        return 0;
//    }
}
