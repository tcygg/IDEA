package com.msb3;

/**
 * @Auther: ygg
 * @Date: 2022/5/12 - 05 - 12 - 13:27
 * @Description: com.msb3
 * @version: 1.0
 */
public class Test {
    //属性
    int a;
    int b;
    static int sa;
    String c;

    //方法
    public void aa(){
        System.out.println(a);
    }
    public static void bb(){
        System.out.println(sa);
    }

    //构造器
    public Test(){

    }
    public Test(int e,int f,String g){
        a=e;
        b=f;
        c=g;

    }
    //代码块
}
