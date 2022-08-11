package com.msb1;

/**
 * @Auther: ygg
 * @Date: 2022/5/7 - 05 - 07 - 18:43
 * @Description: com.msb1
 * @version: 1.0
 */
public class Dog {
    String name;
    int age;
    String color;
    String type;
    String leading;
    public Dog(){

    }
    public Dog(
    String name,
    int age,
    String leading,
    String color,
    String type){
        this.name=name;
        this.age=age;
        this.leading=leading;
        this.color=color;
        this.type=type;
       /* name=a;
        age=b;
        leading=c;
        color=d;
        type=e;*/

    }


    public void eat(String food){
       int age=20;
        System.out.println(this.age);
        System.out.println("我喜欢吃"+food);
    }

}
