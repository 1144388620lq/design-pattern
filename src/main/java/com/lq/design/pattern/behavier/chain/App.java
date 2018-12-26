package com.lq.design.pattern.behavier.chain;

/**
 * @Auther: LQ
 * @Date: 2018/12/26 20:04
 * @Description:
 */
public class App {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("java课程");
        course.setArticle("java设计模式笔记");
        course.setVideo("java视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.publish(course);
    }
}
