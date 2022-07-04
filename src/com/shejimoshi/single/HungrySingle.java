package com.shejimoshi.single;

/**
 * @author curry
 * @package com.shejimoshi.single
 * @date 2022/2/12 22:33
 * @Version V1.0
 */
public class HungrySingle {
    //私有的静态成员变量
    private static HungrySingle instance = new HungrySingle();
    //私有的构造器
    private HungrySingle() {

    }
    //公有的静态获取单例实例方法
    public static HungrySingle getInstance() {
        return instance;
    }

}
