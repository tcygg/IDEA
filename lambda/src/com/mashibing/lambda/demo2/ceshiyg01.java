package com.mashibing.lambda.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/27 - 12 - 27 - 16:54
 * @Description: com.mashibing.lambda.demo2
 * @version: 1.0
 */
public class ceshiyg01 {
    public static void main(String[] args) {

        IMathOperation oo = (int a, int b) -> a + b;

        System.out.println(oo.operation(1, 3));


        IGreeting aa = msg -> System.out.println("haha" + msg);

        aa.sayHello("dhg1");

/*        new Thread(() -> System.out.println(Thread.currentThread().getName() + " 线程0已启动")).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName() + " 线程1已启动")).start();*/


        int arr[] = {22, 33, 55, 66, 44, 99, 10};
        // 计算出数组中的最大值
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i);

        }

        System.out.println(arr[arr.length - 1]);

        // 定义一个List集合
        List<String> list = Arrays.asList("张三", "张三丰", "成龙", "周星驰", "张1号");
        // 1.获取所有 姓张的信息
        // 2.获取名称长度为3的用户
        // 3. 输出所有的用户信息
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> {
                    System.out.println(s);
                });
        System.out.println("----------");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);
    }




}
