package com.lq.design.pattern.structer.bridge;

/**
 * @Auther: LQ
 * @Date: 2018/12/13 21:03
 * @Description:
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account open() {
        System.out.println("  打开中国工商银行");
        account.open();
        return account;
    }
}
