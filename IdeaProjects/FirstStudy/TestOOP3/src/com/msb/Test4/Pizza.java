package com.msb.Test4;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/5 - 07 - 05 - 07:48
 * @Description: com.msb.Test4
 * @version: 1.0
 */
public class Pizza {
    //属性

   private String name;//1.培根    2.水果
    private int price;  //价格
    private int size;   //大小

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public Pizza() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//方法

    public String showPizza(){
        return "匹萨的名字是："+name+"\n匹萨的大小是："+size+"寸\n匹萨的价格："+price+"元";
    }

}
