package com.msb.test3;

/**
 * @Auther: ygg
 * @Date: 2022/6/4 - 06 - 04 - 0:17
 * @Description: com.msb.test3
 * @version: 1.0
 */
public class Person {
    private int age;
    private String name;
    private Double height;
   private static double weight;
    public    int aa;
    public String favorite_sports;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void eat(int weight,String type){
        System.out.println("可以吃饭...父类");
        System.out.println(type+"..."+weight);
    }
    public void sleep(){
        System.out.println("可以睡觉...");
    }

}
