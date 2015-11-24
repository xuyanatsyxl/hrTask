package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftPattern {
    private String patternId;

    private String patternShiftName;

    private Long deptid;

    private String regularCycle;

    private String regularCycleUnit;

    private String operator;

    private Date operateTime;

    private String enabled;

    private String remark;

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId == null ? null : patternId.trim();
    }

    public String getPatternShiftName() {
        return patternShiftName;
    }

    public void setPatternShiftName(String patternShiftName) {
        this.patternShiftName = patternShiftName == null ? null : patternShiftName.trim();
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getRegularCycle() {
        return regularCycle;
    }

    public void setRegularCycle(String regularCycle) {
        this.regularCycle = regularCycle == null ? null : regularCycle.trim();
    }

    public String getRegularCycleUnit() {
        return regularCycleUnit;
    }

    public void setRegularCycleUnit(String regularCycleUnit) {
        this.regularCycleUnit = regularCycleUnit == null ? null : regularCycleUnit.trim();
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

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}