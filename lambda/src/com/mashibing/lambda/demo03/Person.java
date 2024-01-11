package com.mashibing.lambda.demo03;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/11 - 01 - 11 - 18:26
 * @Description: com.mashibing.lambda.demo03
 * @version: 1.0
 */
public class Person {
    String Name;
    Integer Age;
    Integer OLD;

    public Person(String name, Integer age, Integer OLD) {
        Name = name;
        Age = age;
        this.OLD = OLD;
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
        return OLD;
    }

    public void setOLD(Integer OLD) {
        this.OLD = OLD;
    }
}
