package com.msb.test3;

/**
 * @Auther: ygg
 * @Date: 2022/6/4 - 06 - 04 - 0:18
 * @Description: com.msb.test3
 * @version: 1.0
 */
public class Test extends Person{
    public void jj( ){
        System.out.println(aa);
    }
    public static void main(String[] args) {
        Student xusong=new Student();
        xusong.study();

        xusong.setName("许嵩");
        xusong.setAge(37);
        xusong.setHeight(187.7);
        System.out.println(xusong.getAge());
        xusong.aa=18;
        System.out.println(xusong.studyaa());
        System.out.println(xusong.studyaa());
        xusong.eat(180,"fruit");
        System.out.println();

        xusong.super_ceshi("basketball");


    }
}
