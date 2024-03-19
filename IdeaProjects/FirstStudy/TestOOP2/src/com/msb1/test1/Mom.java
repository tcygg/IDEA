package com.msb1.test1;

/**
 * @Auther: zhaoss
 * @Date: 2022/6/27 - 06 - 27 - 03:46
 * @Description: com.msb1.test1
 * @version: 1.0
 */
public class Mom {
    int age;
    String name;

    public Mom() {
    }

    public Mom(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void say(){
        System.out.println("lldd唠唠叨叨"+age+"  "+name);
    }
}
