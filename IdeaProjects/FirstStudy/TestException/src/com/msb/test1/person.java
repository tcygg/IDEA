package com.msb.test1;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/24 - 07 - 24 - 23:51
 * @Description: com.msb.test1
 * @version: 1.0
 */
public class person extends student {
    int age;

    String name;

    public person() {
    }

    public person(int age, String name) {
        this.age = age;

        this.name = name;
    }
}
