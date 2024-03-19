package com.msb1.test1;

/**
 * @Auther: zhaoss
 * @Date: 2022/6/27 - 06 - 27 - 03:48
 * @Description: com.msb1.test1
 * @version: 1.0
 */
public class Tset01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //创建一个Boy类的具体的对象：
        Boy boy = new Boy(30,"鹿晗");
        //创建一个Girl类的具体的对象：
        Girl girl = new Girl("关晓彤",100);
        //谈恋爱：
        //girl.love(boy);
        Boy boy2 = new Boy(35,"陈伟霆");
        girl.love(boy2);
        //还可以跟妈妈微信聊天：
        girl.m = new Mom();
//        girl.m = new Mom(50,"kk");
        girl.wechat();
    }
}
