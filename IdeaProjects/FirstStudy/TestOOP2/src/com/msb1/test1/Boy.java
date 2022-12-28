package com.msb1.test1;

/**
 * @Auther: zhaoss
 * @Date: 2022/6/27 - 06 - 27 - 03:42
 * @Description: com.msb1.test1
 * @version: 1.0
 */
public class Boy {
    //属性：
    int age;
    String name;
    //方法：
    public void buy(){
        System.out.println("跟我谈恋爱，我给你买买买。。。");
    }
    //构造器：
    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
