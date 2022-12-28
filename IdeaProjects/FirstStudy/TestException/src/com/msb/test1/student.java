package com.msb.test1;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Objects;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/25 - 07 - 25 - 00:12
 * @Description: com.msb.test1
 * @version: 1.0
 */
public class student {
    private int age;
    private String name;
    private String sex;

    public student(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public student() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("男") || sex.equals("女")){
            this.sex = sex;
        }else {
            /*try {throw new ReflectiveOperationException("性别不对");}
            catch(ReflectiveOperationException e){
            e.printStackTrace();
        }*/
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }



}
