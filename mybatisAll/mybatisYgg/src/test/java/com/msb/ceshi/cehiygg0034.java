package com.msb.ceshi;

import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/12 - 01 - 12 - 16:17
 * @Description: com.msb.ceshi
 * @version: 1.0
 */

@Slf4j
public class cehiygg0034 {
    public static void main(String[] args) {


//        Thread thread = new Thread(s-> System.out.println("dki"));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("nishizhuy1"+Thread.currentThread().getName());
            }
        }).start();

        System.out.println("这是主线程"+Thread.currentThread().getName());

        new Thread(() -> { System.out.println("新线程Lambda表达式..." +Thread.currentThread().getName()); }).start();

    }

}
