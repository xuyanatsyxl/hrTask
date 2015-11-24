package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftLeave {
    private Long xid;

    private Date adcDate;

    private Long deptid;

    private Long empid;

    private String adcId;

    private String shiftId;

    private String additionInfo;

    private Double affDays;

    private Double affHours;

    private Long requestid;

    private String sourceType;

    private String state;

    private String operator;

    private Date operateTime;

    private String remark;

    public Long getXid() {
        return xid;
    }

    public void setXid(Long xid) {
        this.xid = xid;
    }

    public Date getAdcDate() {
        return adcDate;
    }

    public void setAdcDate(Date adcDate) {
        this.adcDate = adcDate;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getAdcId() {
        return adcId;
    }

    public void setAdcId(String adcId) {
        this.adcId = adcId == null ? null : adcId.trim();
    }

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId == null ? null : shiftId.trim();
    }

    public String getAdditionInfo() {
        return additionInfo;
    }

    public void setAdditionInfo(String additionInfo) {
        this.additionInfo = additionInfo == null ? null : additionInfo.trim();
    }

    public Double getAffDays() {
        return affDays;
    }

    public void setAffDays(Double affDays) {
        this.affDays = affDays;
    }

    public Double getAffHours() {
        return affHours;
    }

    public void setAffHours(Double affHours) {
        this.affHours = affHours;
    }

    public Long getRequestid() {
        return requestid;
    }

    public void setRequestid(Long requestid) {
        this.requestid = requestid;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}