package com.lq.design.pattern.creational.abstractfactory;

/**
 * @Auther: LQ
 * @Date: 2018/12/3 20:50
 * @Description:抽象工厂方法 最佳实践 mybatis：SqlSessionFactory openSession  getConfiguration方法属于同一产品组
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
