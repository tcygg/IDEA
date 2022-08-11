package com.msb2;

/**
 * @Auther: ygg
 * @Date: 2022/5/12 - 05 - 12 - 9:06
 * @Description: com.msb2
 * @version: 1.0
 */
public class Person {
    int id;
    static int sid;

    public static void main(String[] args) {
        Person p1=new Person();
        p1.id=10;
        Person.sid=10;
        Person p2=new Person();
        p2.id=20;
        p2.sid=20;
        System.out.println(p1.id);
        System.out.println(Person.sid);
        System.out.println(p2.id);
        System.out.println(p2.sid);


    }
}
