package com.lq.design.pattern.structer.component;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 22:02
 * @Description:
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
    }

    public void remove(CatalogComponent catalogComponent) {
    }

    public String getName(CatalogComponent catalogComponent) {
        return "";
    }

    public double getPrice(CatalogComponent catalogComponent) {
        return 0;
    }

    public void print() {

    }
}
