package com.msb.test6;

/**
 * @Auther: ygg
 * @Date: 2022/6/6 - 06 - 06 - 18:19
 * @Description: com.msb.test6
 * @version: 1.0
 */
public class Test {
    //main方法,程序的入口
    public static void main(String[] args) {
        Student xusong=new Student(19,"jack",178.3);

        System.out.println(xusong.getAge());
        System.out.println(xusong.toString());
        System.out.println(xusong);

    }
}
