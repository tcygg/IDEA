package com.msb.test10;

/**
 * @Auther: ygg
 * @Date: 2022/6/8 - 06 - 08 - 19:53
 * @Description: com.msb.test10
 * @version: 1.0
 */
public class ceshi {
    public static void main(String[] args) {
        Computer c1=new Computer("苹果",8999.3,2020);
        Computer c2=new Computer("苹果1",8999.3,2020);
        boolean flag2=c1.equals33(c2);
        System.out.println(flag2);
        Cat xiaonghong=new Cat();
        boolean flag=c1.equals33(xiaonghong);
        System.out.println(flag);

       // boolean flag=c1.equals33(xiaonghong);
    }
}
