package com.lq.design.pattern.structer.flywey;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 21:38
 * @Description:模式
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String dep) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(dep);
        if (manager == null) {
            manager = new Manager(dep);
            System.out.println(" 创建部门经理 " + dep);
            manager.setReportContent(dep+"部门汇报：报告内容是主要内容...");
            EMPLOYEE_MAP.put(dep, manager);
        }
        return manager;
    }

}
