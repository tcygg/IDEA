package com.msb.Test4;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/5 - 07 - 05 - 07:49
 * @Description: com.msb.Test4
 * @version: 1.0
 */
public class Fruit_Pizza extends Pizza{
    private String ingredients;

    public Fruit_Pizza() {
    }

    public Fruit_Pizza(String name, int price, int size, String ingredients) {
        super(name, price, size);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果："+ingredients;
    }
}
