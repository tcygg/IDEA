package com.msb.test1;


import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/7 - 07 - 07 - 07:54
 * @Description: com.msb.test1
 * @version: 1.0
 */
public class ceshi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数:");



        if (sc.hasNextInt()) {

            int num1 = sc.nextInt();
            System.out.println("请输入第二个数:");
            if(sc.hasNextInt()) {

                int num2=sc.nextInt();
                if(num2==0){
                    System.out.println("对不起,除数不能为0");
                }
                else {
                    System.out.println("商是"+num1/num2);
                }

            }
            else {
                System.out.println("您输入的不是整数");
            }
        }
        else {
            System.out.println("您录入的不是整数");
        }


        }
    }
