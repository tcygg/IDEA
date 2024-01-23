package com.msb.ceshi;

import com.sun.org.apache.bcel.internal.generic.NEW;
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
public class cehiygg0034 {
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


    @Test
    public void YGG001() {
        HashMap<Integer, String> ceshiMap = new HashMap<>();
        ceshiMap.put(1, "xusong1");
        ceshiMap.put(2, "xusong2");
        ceshiMap.put(3, "xusong3");
        ceshiMap.put(4, "xusong4");

//        System.out.println(ceshiMap);

        Stream<Integer> stream = ceshiMap.keySet().stream();
        List<Integer> collect = stream.collect(Collectors.toList());
        System.out.println(collect);

        Set<Map.Entry<Integer, String>> entries = ceshiMap.entrySet();
        List<Map.Entry<Integer, String>> collect1 = entries.stream().collect(Collectors.toList());

        System.out.println(collect1.get(1));

        Stream<Map.Entry<Integer, String>> stream2 = ceshiMap.entrySet().stream();
//        stream2.forEach(System.out::println);// entry

//        List<Map.Entry<Integer, String>> collect2 = stream2.collect(Collectors.toList());
//        System.out.println(collect2.get(1));

//        stream2.forEach(System.out::println);



   /*     System.out.println("--------");
        stream2.filter(s->s.getKey()==2)
                .filter(S->S.getValue().contains("g"))
                .forEach(System.out::println);*/
//        Stream<Integer> stream1 = ceshiMap.keySet().stream();

//        ceshiMap.keySet().stream().map(a -> String.valueOf(a)).forEach(s-> System.out.println(s.getClass()));


        Stream<String> stringStream = ceshiMap.keySet().stream().map(a -> String.valueOf(a));


    }

}
