package com.msb.test8;

import javax.print.attribute.standard.MediaSize;

/**
 * @Auther: ygg
 * @Date: 2022/6/8 - 06 - 08 - 18:34
 * @Description: com.msb.test8
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Phone p1 =new Phone("huawei",2035.98,2016);
        Phone p2 =new Phone("huawei",2035.98,2016);


        boolean flag = p1.equals44(p2);
        System.out.println(flag);
        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());



    }
}

