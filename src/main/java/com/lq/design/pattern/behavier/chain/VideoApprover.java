package com.lq.design.pattern.behavier.chain;

import org.springframework.util.StringUtils;

/**
 * @Auther: LQ
 * @Date: 2018/12/26 20:01
 * @Description:
 */
public class VideoApprover extends Approver {
    @Override
    public void publish(Course course) {
        if (!StringUtils.isEmpty(course.getVideo())) {
            System.out.println(course.getName() + "有视频  审核通过");
            if (nextApprover != null) {
                nextApprover.publish(course);
            }
        } else {
            System.out.println(course.getName() + "没有有视频 审核拒绝");
        }
    }
}
