package com.lq.design.pattern.structer.component;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 22:04
 * @Description:
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("couse name :" + name + "  price:" + price);
    }
}
