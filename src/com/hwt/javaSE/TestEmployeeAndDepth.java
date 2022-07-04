package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:25
 * @Version V1.0
 */
public class TestEmployeeAndDepth {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1001);
        employee.setName("张三");
        employee.setAge(20);
        employee.setSex(true);
        employee.setDepth(new Depth(1, "研发部", "E栋101"));
        System.out.println(employee);
    }
}
