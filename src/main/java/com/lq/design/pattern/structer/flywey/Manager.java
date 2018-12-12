package com.lq.design.pattern.structer.flywey;

/**
 * @Auther: LQ
 * @Date: 2018/12/12 21:36
 * @Description:
 */
public class Manager implements Employee {
    private String dep;
    private String reportContent;

    public Manager(String dep) {
        this.dep = dep;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
