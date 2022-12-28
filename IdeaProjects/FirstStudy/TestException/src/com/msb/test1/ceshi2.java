package com.msb.test1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ceshi2 {

    public static void main(String[] args) {
        //实现一个功能：键盘录入两个数，求商：
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商：" + num1 / num2);
        }

        catch(ArithmeticException |InputMismatchException ex){
            System.out.println("对不起，除数不可以为0");
        }
        catch(Exception ex){
            System.out.println("对不起，程序出现异常！");
        }
        finally
         {
            System.out.println("我就是试一试最后");
        }
        System.out.println("----谢谢你使用计算器");


    }

}
