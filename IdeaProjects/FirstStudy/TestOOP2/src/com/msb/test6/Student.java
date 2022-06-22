package com.msb.test6;

/**
 * @Auther: ygg
 * @Date: 2022/6/6 - 06 - 06 - 18:17
 * @Description: com.msb.test6
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private double height;

    public Student() {
    }

    public Student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
