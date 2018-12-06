package com.lq.design.pattern.creational.prototype;

import java.util.Date;

/**
 * @Auther: LQ
 * @Date: 2018/12/6 21:54
 * @Description:原型模式 注意深浅复制的区别和一些坑
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Category category = new Category(1, 111);
        Date date = new Date(0L);
        Book originBook = new Book("世界", 1, date);
        originBook.setCategory(category);
        Book cloneBook = (Book) originBook.clone();
        System.out.println(originBook);
        System.out.println(cloneBook);
        System.out.println(originBook.hashCode() == cloneBook.hashCode());

        System.out.println("  1-------------------------");
        originBook.setName("世界v2");
        originBook.setStock(10);
        originBook.setUpTime(new Date());

        System.out.println(originBook);
        System.out.println(cloneBook);
        System.out.println(originBook.hashCode() == cloneBook.hashCode());
        System.out.println("  2-------------------------");
        cloneBook.setName("世界v3");
        cloneBook.setStock(100);
        cloneBook.setUpTime(new Date(77777777777777L));
        category.setType(2222222);
        originBook.setCategory(category);

        System.out.println(originBook);
        System.out.println(cloneBook);
        System.out.println(originBook.hashCode() == cloneBook.hashCode());

    }
}
