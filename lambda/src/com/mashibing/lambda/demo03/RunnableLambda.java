package com.mashibing.lambda.demo03;

public class RunnableLambda {
    public static void main(String[] args) {
        // 使用匿名内部类的方式,实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " 线程已启动");
            }
        }).start();

        // 使用Lambda表达式,实现多线程
        new Thread(() -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " 线程已启动");
        }).start();

        // 优化省略Lambda
        new Thread(() -> System.out.println(Thread.currentThread().getName() + " 线程已启动")).start();
    }
}
