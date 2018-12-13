package com.lq.design.pattern.structer.bridge;

/**
 * @Auther: LQ
 * @Date: 2018/12/13 20:57
 * @Description:
 */
public class DepositAccount implements Account {
    @Override
    public Account open() {
        System.out.println(" 打开定期账号 ");
        return new DepositAccount();
    }

    @Override
    public void showType() {
        System.out.println("  定期类型");
    }
}
