package com.mashibing.lambda.demo1;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/23 - 12 - 23 - 20:12
 * @Description: com.mashibing.lambda.demo1
 * @version: 1.0
 */
public class ceshi02 {

    public static void main(String[] args) {
        goShow(new UserService() {
            @Override
            public void show() {
                System.out.println("show 方法执行了...");
            }
        });
        System.out.println("----------");
        goShow(() -> { System.out.println("Lambda show 方法执行了..."); });
        System.out.println("----------");


        goShow(new UserService() {
            @Override
            public void show() {
                System.out.println("show 方法执行了...");
            }
        });
    }

    public static void goShow(UserService userService){
        userService.show();
    }


}
