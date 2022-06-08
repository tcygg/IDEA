package com.msb;

/**
 * @Auther: ygg
 * @Date: 2022/4/30 - 04 - 30 - 17:33
 * @Description: com.msb
 * @version: 1.0
 */
public class Student {
    byte e;
    short s;
    int c ;//成员变量：在类中方法外
    long num2;
    float f ;
    double d;
    char ch;
    boolean bo;
    String name;

    public Student(){

    }
    public Student(int c1,long num21){
        this.c=c1;
        this.num2=num21;

    }
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st.c);
        Student s = new Student();
        System.out.println(s.c);
        System.out.println(s.bo);
        System.out.println(s.ch);
        System.out.println(s.d);
        System.out.println(s.e);
        System.out.println(s.f);
        System.out.println(s.name);
        System.out.println(s.num2);
        System.out.println(s.s);
    }
}
