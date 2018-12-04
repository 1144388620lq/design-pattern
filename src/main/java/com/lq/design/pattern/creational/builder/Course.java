package com.lq.design.pattern.creational.builder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: LQ
 * @Date: 2018/12/4 20:25
 * @Description:建造者模式 这是基础的简单链式调用写法
 * 最佳实践有很多 比如guava Cache,jdk的stringBuffer & stringBuilder,mybatis的sqlSessionFactoryBuilder等等，
 * 我们平时的业务类也很常用,需掌握。
 * @see Test
 */
public class Course {
    private String name;
    private String url;
    //question & answer
    private String qa;
    private BigDecimal price;
    private Date created;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.url = courseBuilder.url;
        this.qa = courseBuilder.qa;
        this.price = courseBuilder.price;
        this.created = courseBuilder.created;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", qa='" + qa + '\'' +
                ", price=" + price +
                ", created=" + created +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public static class CourseBuilder {
        //实际中 会有些默认值 和方法的重载等 都很常见
        private String name = "default";
        private String url = "default";
        private String qa = "default";
        private BigDecimal price;
        private Date created;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildUrl(String url) {
            this.url = url;
            return this;
        }

        public CourseBuilder buildQa(String qa) {
            this.qa = qa;
            return this;
        }

        public CourseBuilder buildPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public CourseBuilder buildCreated(Date created) {
            this.created = created;
            return this;
        }

        public Course build() {
            return new Course(this);
        }

    }
}
