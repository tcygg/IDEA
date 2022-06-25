package com.msb.test10;

import com.msb.test9.Phone;

/**
 * @Auther: ygg
 * @Date: 2022/6/8 - 06 - 08 - 19:52
 * @Description: com.msb.test10
 * @version: 1.0
 */
public class Computer {
    private String brand;//品牌型号
    private double price;//价格
    private int year;//出产年份

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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



    public Computer(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public boolean equals33(Object obj) {

        if (obj instanceof Computer) {
            Computer other = (Computer) obj;
            if (this.getPrice() == other.getPrice() && this.getBrand() == other.getBrand() && this.getYear() == other.getYear()) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
            

        }
    }
}