package com.lq.design.pattern.behavier.chain;


/**
 * @Auther: LQ
 * @Date: 2018/12/26 19:55
 * @Description:
 */
public abstract class Approver {

    protected Approver nextApprover;

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }
    public abstract void publish(Course course);

}
