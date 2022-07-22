package com.msb.test1;

import java.util.Scanner;


public class ceshi2 {

    public static void main(String[] args) {
        //实现一个功能：键盘录入两个数，求商：
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商："+num1/num2);
        }catch(Exception ex){
            System.out.println("对不起，程序出现异常！");
        }
        System.out.println("----谢谢你使用计算器111");
        System.out.println("----谢谢你使用计算器222");
        System.out.println("----谢谢你使用计算器333");
        System.out.println("----谢谢你使用计算器444");
        System.out.println("----谢谢你使用计算器555");
        System.out.println("----谢谢你使用计算器666");
        System.out.println("----谢谢你使用计算器777");
        System.out.println("----谢谢你使用计算器888");
        System.out.println("----谢谢你使用计算器zuihou1yici");
    }

}
