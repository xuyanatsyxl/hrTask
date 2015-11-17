package org.infotechdept.hr.task.model;

public class AdcShiftGroupEmpl {
    private Integer oid;

    private String groupId;

    private Long empid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }
}