package com.hwt.reflect;

/**
 * @author curry
 * @package com.hwt.reflect
 * @date 2022/6/23 18:07
 * @Version V1.0
 */
public class ReflectTest02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 通过反射机制，获取Class，通过Class来实例化对象
        Class c = Class.forName("com.hwt.reflect.User");
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
