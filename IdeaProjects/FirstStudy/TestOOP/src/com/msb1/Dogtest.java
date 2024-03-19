package com.msb1;

import java.util.Scanner;

/**
 * @Auther: ygg
 * @Date: 2022/5/7 - 05 - 07 - 18:47
 * @Description: com.msb1
 * @version: 1.0
 */
public class Dogtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的体重:");
        double weight =sc.nextDouble();
        System.out.println(weight);

        Dog xiaohong =new Dog();
        xiaohong.eat("gutou");
       // System.out.println(xiaohong.name);


        Dog beila =new Dog("beila",5,"黑白斑点","边牧","张鑫");
        System.out.println(beila.name);
        System.out.println(beila.leading);
        beila.eat("shiwu");


    }


}
