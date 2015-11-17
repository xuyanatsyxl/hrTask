package org.infotechdept.hr.task.model;

public class Deptempl extends DeptemplKey {
    private String deptname;

    private Integer zbzwid;

    private String jobname;

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public Integer getZbzwid() {
        return zbzwid;
    }

    public void setZbzwid(Integer zbzwid) {
        this.zbzwid = zbzwid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }
}