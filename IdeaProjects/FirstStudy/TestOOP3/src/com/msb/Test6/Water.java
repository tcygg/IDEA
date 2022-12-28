package com.msb.Test6;

/**
 * @Auther: zhaoss
 * @Date: 2022/8/12 - 08 - 12 - 16:46
 * @Description: com.msb.Test6
 * @version: 1.0
 */
//测试一下git功能
public class Water {
    int weight;
    String color;
    double price;
//    public Water(){
//
//    }
//    public Water(int weight,double price){
//
//    }


    public Water() {
    }

    public Water(int weight, String color, double price) {
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Water{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
