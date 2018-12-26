package com.lq.design.pattern.behavier.chain;

import org.springframework.util.StringUtils;

/**
 * @Auther: LQ
 * @Date: 2018/12/26 20:01
 * @Description:
 */
public class ArticleApprover extends Approver {
    @Override
    public void publish(Course course) {
        if (!StringUtils.isEmpty(course.getArticle())) {
            System.out.println(course.getName() + "有笔记  审核通过");
            if (nextApprover != null) {
                nextApprover.publish(course);
            }
        } else {
            System.out.println(course.getName() + "没有笔记 审核拒绝");
        }
    }
}
