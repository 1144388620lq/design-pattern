package com.lq.design.pattern.structer.flywey;

import java.util.Random;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 21:42
 * @Description:
 */
public class App {
    private static final String[] deps = {"QA", "PM", "RD", "CF", "CE", "WQ", "SS", "SA"};

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int rand = random.nextInt(deps.length);
            String dep = deps[rand];
            Manager manager = (Manager) EmployeeFactory.getManager(dep);
            manager.report();
        }
    }
}
