package com.mashibing.lambda.demo1;

import com.mashibing.lambda.demo2.IMathOperation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/22 - 12 - 22 - 19:22
 * @Description: com.mashibing.lambda.demo1
 * @version: 1.0
 */
public class YggLamda01 {
    public static <b> void main(String[] args) {

       /*     List<String> strList = Arrays.asList("d", "ff", "dds");
            strList.forEach(s -> {
                System.out.println(s);
            });


        System.out.println(strList);

        for (String s : strList) {
            System.out.println(s);

        }
        System.out.println("------线程----");*/
        Executors.newCachedThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中执行的代码"+Thread.currentThread().getName());


            }
        });
        System.out.println("新线程中执行的代码"+Thread.currentThread().getName());


/*
        strList.forEach(System.out::println);
        strList.forEach(System.out::println);

        System.out.println("----------");


*//*        IMathOperation iMathOperation = ( a,  b) -> {
            return a + b;
        };
//        System.out.println(iMathOperation);*//*
//        User zhangan = new User("zhang", 67);
//        zhangan( int a;  int b) -> {
//            return a + b;
//        };*/

    }
    }

