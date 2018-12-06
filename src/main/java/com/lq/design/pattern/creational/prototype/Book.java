package com.lq.design.pattern.creational.prototype;

import java.util.Date;

/**
 * @Auther: LQ
 * @Date: 2018/12/6 21:52
 * @Description:
 */
public class Book implements Cloneable {
    private String name;
    private int stock;
    private Date upTime;
    private Category category;

    public Book() {
    }

    public Book(String name, int stock, Date upTime) {
        this.name = name;
        this.stock = stock;
        this.upTime = upTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        this.category = (Category) category.clone();
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", upTime=" + upTime +
                ", category=" + category +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
