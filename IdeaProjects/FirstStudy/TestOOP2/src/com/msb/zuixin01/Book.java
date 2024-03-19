package com.msb.zuixin01;

/**
 * @Auther: zhaoss
 * @Date: 2022/6/23 - 06 - 23 - 19:10
 * @Description: com.msb.zuixin01
 * @version: 1.0
 */
public class Book {
    private int page;
    private double price;
    private String name;
    private int year;

    public Book() {
    }

    public Book(int page, double price) {
        this.page = page;
        this.price = price;
    }

    public Book(int page, double price, String name, int year) {
        this.page = page;
        this.price = price;
        this.name = name;
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
