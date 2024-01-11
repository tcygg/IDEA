package com.mashibing.lambda.demo1;

import com.mashibing.lambda.demo09.father.Greetable;
import com.mashibing.lambda.demo2.IMathOperation;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/27 - 12 - 27 - 15:49
 * @Description: com.mashibing.lambda.demo1
 * @version: 1.0
 */
public class ceshi004 {
    public static void main(String[] args) {


        Factory fa1 = new SubClass();



        fa1 = ()->
            new User("xusong",89);

        System.out.println(fa1.getObject());
        System.out.println(fa1.toString());

        int aaa;



        YggAdd fa11 = (int a, int b) -> {
            return 1 + 2;
        };
        System.out.println(fa11);

/*
        int a =6;
        int b =9;

        YggAdd fa12 = ( a,  b) -> {
            return 1 + 2;
        };
        System.out.println(fa12);

*/

//        () -> System.out.println("nidhiei");


    }
    public static String prr(String aa){
        return aa;


    }

}
