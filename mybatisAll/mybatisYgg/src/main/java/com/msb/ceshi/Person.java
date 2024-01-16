package com.msb.ceshi;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/12 - 01 - 12 - 16:01
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class Person {

    String Name;
    Integer Age;
    Integer Old;

    public Person(String name, Integer age, Integer OLD) {
        Name = name;
        Age = age;
        this.Old = Old;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getOLD() {
        return Old;
    }

    public void setOLD(Integer Old) {
        this.Old = Old;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Old=" + Old +
                '}';
    }

}
