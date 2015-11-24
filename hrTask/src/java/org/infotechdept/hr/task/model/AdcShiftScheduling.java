package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftScheduling {
    private Long id;

    private Date schDate;

    private Long deptid;

    private String groupId;

    private Long empid;

    private String shiftId;

    private Long recId;

    private Date workTime;

    private Date actualWorkTime;

    private Date offTime;

    private Date actualOffTime;

    private String adcId;

    private String recordType;

    private String priority;

    private Double count;

    private String shiftSymbol;

    private Date tm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSchDate() {
        return schDate;
    }

    public void setSchDate(Date schDate) {
        this.schDate = schDate;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
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

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId == null ? null : shiftId.trim();
    }

    public Long getRecId() {
        return recId;
    }

    public void setRecId(Long recId) {
        this.recId = recId;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getActualWorkTime() {
        return actualWorkTime;
    }

    public void setActualWorkTime(Date actualWorkTime) {
        this.actualWorkTime = actualWorkTime;
    }

    public Date getOffTime() {
        return offTime;
    }

    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    public Date getActualOffTime() {
        return actualOffTime;
    }

    public void setActualOffTime(Date actualOffTime) {
        this.actualOffTime = actualOffTime;
    }

    public String getAdcId() {
        return adcId;
    }

    public void setAdcId(String adcId) {
        this.adcId = adcId == null ? null : adcId.trim();
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public String getShiftSymbol() {
        return shiftSymbol;
    }

    public void setShiftSymbol(String shiftSymbol) {
        this.shiftSymbol = shiftSymbol == null ? null : shiftSymbol.trim();
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }
}