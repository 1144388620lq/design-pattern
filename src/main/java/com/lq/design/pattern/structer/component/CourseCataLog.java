package com.lq.design.pattern.structer.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 22:07
 * @Description:
 */
public class CourseCataLog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCataLog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent item : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("   ");
                }
            }
            item.print();
        }
    }
}
