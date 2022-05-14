package com.msb1;

/**
 * @Auther: ygg
 * @Date: 2022/4/30 - 04 - 30 - 17:46
 * @Description: com.msb1
 * @version: 1.0
 */
public class Person {
    String name;
    int age;
    double height;
   public Person(){

    }
    public Person(int age,double height,String name){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
