package com.mashibing.lambda.demo1;

import lombok.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/25 - 12 - 25 - 10:55
 * @Description: com.mashibing.lambda.demo1
 * @version: 1.0
 */

public class Person {

    private String name;

    private Integer age;

    private Integer height;

    public Person(String name, Integer age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}