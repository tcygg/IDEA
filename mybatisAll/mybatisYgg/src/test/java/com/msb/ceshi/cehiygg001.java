package com.msb.ceshi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/12 - 01 - 12 - 16:17
 * @Description: com.msb.ceshi
 * @version: 1.0
 */

@Slf4j
public class cehiygg001 {
    @Test
    public void cehhi1() {

//        Thread thread = new Thread(s-> System.out.println("dki"));

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("nishizhuy1" + Thread.currentThread().getName());
            }
        }).start();

        System.out.println("这是主线程" + Thread.currentThread().getName());

        new Thread(() -> {
            System.out.println("新线程Lambda表达式..." + Thread.currentThread().getName());
        }).start();

    }


}
