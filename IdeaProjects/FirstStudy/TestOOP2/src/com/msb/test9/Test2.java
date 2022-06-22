package com.msb.test9;



/**
 * @Auther: ygg
 * @Date: 2022/6/8 - 06 - 08 - 19:45
 * @Description: com.msb.test9
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Phone p1 =new Phone("huawei",5999.2,2016);
        Phone p2 =new Phone("huawei",5999.2,2016);


        boolean flag = p1.equals11(p2);
        System.out.println(flag);


    }
}
