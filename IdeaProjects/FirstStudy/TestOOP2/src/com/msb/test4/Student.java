package com.msb.test4;

/**
 * @Auther: ygg
 * @Date: 2022/6/6 - 06 - 06 - 17:16
 * @Description: com.msb.test4
 * @version: 1.0
 */
public class Student extends Person {
    int sno;
    int score;

    public Student(int sno) {
        this.sno = sno;
    }

    public Student(int age, String name, double weight, int score) {
        super(age, name, weight);
        this.score = score;
    }

    public Student(int a, int b){
        this.score=a;
        this.age=b;

    }

    public Student() {
    }

    public Student(int age, String name, double weight) {
        super(age, name, weight);
    }
}
