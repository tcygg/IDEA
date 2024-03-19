package com.msb1;

/**
 * @Auther: ygg
 * @Date: 2022/5/3 - 05 - 03 - 19:39
 * @Description: com.msb1
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person lisi=new Person(12,173.2,"lisi");
        System.out.println(lisi.name);
        System.out.println(lisi.height);
        lisi.eat();

    }
}
