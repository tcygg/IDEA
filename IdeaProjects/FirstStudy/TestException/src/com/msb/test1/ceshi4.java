package com.msb.test1;

import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/24 - 07 - 24 - 23:44
 * @Description: com.msb.test1
 * @version: 1.0
 */
public class ceshi4 {
    public static void main(String[] args) {
    person xusong=new person(35,"许嵩");
    ceshi4 ss=new ceshi4();
    ceshi4.devide();
    }
    public static void devide(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1=sc.nextInt();
        System.out.println("请输入第二个数");
        int num2=sc.nextInt();
        if(num2==0){
            System.out.println("制造异常");
        }else {
            System.out.println("商=" + num1 / num2);
        }
    }
}
