package com.msb.Test4;

import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/3 - 07 - 03 - 22:53
 * @Description: com.msb.Test4
 * @version: 1.0
 */
public class Ceshi1 {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("请选择想要制作的披萨:1.培根披萨 2.水果披萨");
        int choice =sc.nextInt();
//        System.out.println("请输入培根的克数:");
//        int weight =sc.nextInt();
//        System.out.println("请输入披萨的大小:");
//        int size =sc.nextInt();
//        System.out.println("请输入披萨的价格:");
//        int price =sc.nextInt();


        Pizza pizza = Pizza_Factory.getPizza(choice);
        System.out.println(pizza.showPizza());

    }
}
