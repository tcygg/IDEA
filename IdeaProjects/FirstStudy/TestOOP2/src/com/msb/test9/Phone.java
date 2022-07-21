package com.msb.test9;

import java.util.Objects;

/**
 * @Auther: ygg
 * @Date: 2022/6/8 - 06 - 08 - 19:16
 * @Description: com.msb.test9
 * @version: 1.0
 */
public class Phone {//手机类：
    //属性：
    private String brand;//品牌型号
    private double price;//价格
    private int year;//出产年份

    //方法：
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    //构造器：
    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    //对equals方法进行重写：
    public boolean equals33(Object obj) {//Object obj = new Phone();
        //将obj转为Phone类型：
        Phone other = (Phone) obj;//向下转型，为了获取子类中特有的内容
        if (this.getBrand() == other.getBrand() && this.getPrice() == other.getPrice() && this.getYear() == other.getYear()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean equals11(Object obj){
        //将obj转为Phone类型
        Phone other = (Phone)obj;
        if(this.getBrand()==other.getBrand() && this.getPrice()==other.getPrice() && this.getYear()==other.getYear())
        {
            return true;
        }{
            return false;
        }

    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 && year == phone.year && Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}