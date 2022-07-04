package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:22
 * @Version V1.0
 */
public class Employee {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }

    private long id;
    private String name;
    private int age;
    private boolean sex;
    private Depth depth;

    public Depth getDepth() {
        return depth;
    }

    public void setDepth(Depth depth) {
        this.depth = depth;
    }

    public Employee(long id, String name, int age, boolean sex, Depth depth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.depth = depth;
    }

    public Employee(Depth depth) {

        this.depth = depth;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


}
