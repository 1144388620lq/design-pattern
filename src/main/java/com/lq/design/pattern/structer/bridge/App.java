package com.lq.design.pattern.structer.bridge;

/**
 * @Auther: LQ
 * @Date: 2018/12/13 21:09
 * @Description:桥接模式
 */
public class App {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcDeAcc = icbcBank.open();
        icbcDeAcc.showType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abc = abcBank.open();
        abc.showType();
    }
}
