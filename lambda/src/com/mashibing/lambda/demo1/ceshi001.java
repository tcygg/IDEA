package com.mashibing.lambda.demo1;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/23 - 12 - 23 - 19:45
 * @Description: com.mashibing.lambda.demo1
 * @version: 1.0
 */
public class ceshi001 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中执行的代码"+Thread.currentThread().getName());

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中执行的代码2"+Thread.currentThread().getName());

            }
        }).start();
        System.out.println("线程中执行的代码2"+Thread.currentThread().getName());


        new Thread(()->{
            System.out.println("djnjnjd");
        }).start();

    }
}
