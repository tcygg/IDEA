package com.msb.test1;

/**
 * @Auther: zhaoss
 * @Date: 2022/8/20 - 08 - 20 - 22:40
 * @Description: com.msb.test1
 * @version: 1.0
 */
public class Person {
    Integer age =15;
   String sex ;
   String name;
   double height;
   public Person(){

   }


    public Person(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
