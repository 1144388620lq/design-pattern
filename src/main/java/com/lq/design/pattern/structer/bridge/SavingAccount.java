package com.lq.design.pattern.structer.bridge;

/**
 * @Auther: LQ
 * @Date: 2018/12/13 20:57
 * @Description:
 */
public class SavingAccount implements Account {
    @Override
    public Account open() {
        System.out.println(" 打开活期账号 ");
        return new SavingAccount();
    }

    @Override
    public void showType() {
        System.out.println(" 活期类型 ");
    }
}
