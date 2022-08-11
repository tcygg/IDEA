package com.msb.Test3;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/3 - 07 - 03 - 22:25
 * @Description: com.msb.Test3
 * @version: 1.0
 */
public class ceshi2 {
    //非静态的成员内部类：
    public class D{
        int age = 20;
        String name;
        public void method(){
            //5.内部类可以访问外部类的内容
            /*System.out.println(age);
            a();*/
            int age = 30;
            //8.内部类和外部类属性重名的时候，如何进行调用：
            System.out.println(age);//30
            System.out.println(this.age);//20
            System.out.println(ceshi2.this.age);//10
        }
    }
    //静态成员内部类：
    static class E{
        public void method(){
            //6.静态内部类中只能访问外部类中被static修饰的内容
            /*System.out.println(age);
            a();*/
        }
    }
    //属性：
    int age = 10;
    //方法：
    public void a(){
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");
            class B{
            }
        }
        class A{
        }
        //7.外部类想要访问内部类的东西，需要创建内部类的对象然后进行调用
        D d = new D();
        System.out.println(d.name);
        d.method();
    }
    static{
        System.out.println("这是静态块");
    }
    {
        System.out.println("这是构造块");
    }
    //构造器：
    public ceshi2(){
        class C{
        }
    }
    public ceshi2(int age) {
        this.age = age;
    }
}
class Demo{
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //创建外部类的对象：
        ceshi2 to = new ceshi2();
        to.a();
        //9.创建内部类的对象：
        //静态的成员内部类创建对象：
        ceshi2.E e = new ceshi2.E();
        //非静态的成员内部类创建对象：
        //错误：ceshi2.D d = new ceshi2.D();
        ceshi2 t = new ceshi2();
        ceshi2.D d = t.new D();
    }
}
