package com.lq.design.pattern.creational.prototype;

/**
 * @Auther: LQ
 * @Date: 2018/12/6 22:00
 * @Description:
 */
public class Category  implements Cloneable{
    private int id;
    private int type;

    public Category() {
    }

    public Category(int id, int type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
