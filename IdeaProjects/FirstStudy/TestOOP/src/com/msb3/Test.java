package com.msb3;

import com.msb1.Person;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


/**
 * @Auther: ygg
 * @Date: 2022/5/12 - 05 - 12 - 13:27
 * @Description: com.msb3
 * @version: 1.0
 */
public class Test {
    //属性
    int a;
   static int [] ceshishuzu= {1,2,3,4};
    int b;
    static int sa;
    String c;

    //方法
    public void aa(){
        System.out.println(a);
    }
    public static void bb(){
        System.out.println(sa);
    }

    //构造器
    public Test(){

    }
    public Test(int e,int f,String g){
        a=e;
        b=f;
        c=g;

    }

    public static void main(String[] args) {
        new Person();
        new Date();
        new java.sql.Date(1000L);
        new java.sql.Date(1000,3,2);
        System.out.println(Arrays.toString(ceshishuzu));
        Scanner sc=new Scanner(System.in);
    }
    //代码块
}
