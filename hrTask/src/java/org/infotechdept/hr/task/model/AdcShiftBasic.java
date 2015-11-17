package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftBasic {
    private String shiftId;

    private String basicShiftName;

    private String deptid;

    private String workTime;

    private String offTime;

    private String shiftType;

    private String adcId;

    private String operator;

    private Date operateTime;

    private String intervalStartTime;

    private String intervalEndTime;

    private String remark;

    private String enabled;

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId == null ? null : shiftId.trim();
    }

    public String getBasicShiftName() {
        return basicShiftName;
    }

    public void setBasicShiftName(String basicShiftName) {
        this.basicShiftName = basicShiftName == null ? null : basicShiftName.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getOffTime() {
        return offTime;
    }

    public void setOffTime(String offTime) {
        this.offTime = offTime == null ? null : offTime.trim();
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType == null ? null : shiftType.trim();
    }

    public String getAdcId() {
        return adcId;
    }

    public void setAdcId(String adcId) {
        this.adcId = adcId == null ? null : adcId.trim();
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

    public String getIntervalStartTime() {
        return intervalStartTime;
    }

    public void setIntervalStartTime(String intervalStartTime) {
        this.intervalStartTime = intervalStartTime == null ? null : intervalStartTime.trim();
    }

    public String getIntervalEndTime() {
        return intervalEndTime;
    }

    public void setIntervalEndTime(String intervalEndTime) {
        this.intervalEndTime = intervalEndTime == null ? null : intervalEndTime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }
}