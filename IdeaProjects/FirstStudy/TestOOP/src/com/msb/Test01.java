package com.msb;

/**
 * @Auther: ygg
 * @Date: 2022/4/30 - 04 - 30 - 15:59
 * @Description: com.msb
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[]args){
        //创建一个人类的具体的对象/实例：
        //创建一个对象，对象的名字叫：zs
        //Person 属于 引用数据类型
        //第一次加载类的时候，会进行类的加载，初始化创建对象的时候，对象的属性没有给赋值，有默认的初始化的值
        Person zs =new Person();

        zs.name="张三";
        zs.age=25;
        zs.weight=138;
        zs.height=169.4;
        zs.eyeglasses=true;

        //创建一个新对象
        Person lisi = new Person();
        lisi.name="李四";
        lisi.age=28;
        lisi.weight=175.8;
        lisi.height=199.4;
        lisi.eyeglasses=false;

        System.out.println(zs.name);
        System.out.println(lisi.weight);
        System.out.println(zs.introduce());
        zs.eat();
        lisi.sleep("沙发");
        System.out.println("我就是试一试git");
        System.out.println("我就是试一试git22211dev_mac");
        System.out.println("最后一次测试双设备代码联动");
    }
}
