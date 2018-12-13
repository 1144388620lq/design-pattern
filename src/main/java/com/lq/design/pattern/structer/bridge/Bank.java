package com.lq.design.pattern.structer.bridge;

/**
 * @Auther: LQ
 * @Date: 2018/12/13 21:00
 * @Description:
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account open();


}
