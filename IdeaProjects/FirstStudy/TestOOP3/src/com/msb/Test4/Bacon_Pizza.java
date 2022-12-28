package com.msb.Test4;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/5 - 07 - 05 - 07:50
 * @Description: com.msb.Test4
 * @version: 1.0
 */
public class Bacon_Pizza extends Pizza{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bacon_Pizza() {
    }

    public Bacon_Pizza(String name, int price, int size, int weight) {
        super(name, price, size);
        this.weight = weight;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根的克数是："+weight+"克";
    }
}
