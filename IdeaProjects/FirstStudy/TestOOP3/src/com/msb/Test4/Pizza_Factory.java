package com.msb.Test4;

import java.awt.*;
import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/5 - 07 - 05 - 08:57
 * @Description: com.msb.Test4
 * @version: 1.0
 */
public class Pizza_Factory {

public static Pizza getPizza(int Choice) {
    Scanner sc=new Scanner(System.in);
    Pizza p=null;

    switch (Choice) {
        case 1: {
            System.out.println("请录入培根的克数：");
            int weight = sc.nextInt();
            System.out.println("请录入匹萨的大小：");
            int size = sc.nextInt();
            System.out.println("请录入匹萨的价格：");
            int price = sc.nextInt();
            //将录入的信息封装为培根匹萨的对象：
            Bacon_Pizza bp = new Bacon_Pizza("培根匹萨",size,price,weight);
            p = bp;

        }
        ;
        break;
        case 2: {
            System.out.println("请录入你想要加入的水果：");
            String burdening = sc.next();
            System.out.println("请录入匹萨的大小：");
            int size = sc.nextInt();
            System.out.println("请录入匹萨的价格：");
            int price = sc.nextInt();
            //将录入的信息封装为水果匹萨的对象：
            Fruit_Pizza fp = new Fruit_Pizza("水果匹萨",size,price,burdening);
            p = fp;


        }
        ;
        break;
    }
    return p;
}
}
