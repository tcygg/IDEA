package com.msb.test1;

import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2022/6/27 - 06 - 27 - 04:15
 * @Description: com.msb.test1
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {



//        Cat xiaohong=new Cat();
       // Girls meimei=new Girls();
//        meimei.play(xiaohong);
//        meimei.play(d);

       // Animals an=new Animals();
        //Dog d=new Dog();
        //Animals an=new Dog();
       // Animals an=new Dog();

       // meimei.play(an);
        //an.shout();
        Animals an=new Cat();
        System.out.println(an.name);
        an.shout();
        Cat c=(Cat) an;
        System.out.println(c.name);
        c.shout();
    }
}
