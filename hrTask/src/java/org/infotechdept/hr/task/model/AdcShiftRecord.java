package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftRecord {
    private Long recId;

    private Long applyId;

    private Date initDate;

    private Integer initPosition;

    private String holiable;

    private Date validStartDate;

    private String recState;

    private String operator;

    private Date operateTime;

    public Long getRecId() {
        return recId;
    }

    public void setRecId(Long recId) {
        this.recId = recId;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Integer getInitPosition() {
        return initPosition;
    }

    public void setInitPosition(Integer initPosition) {
        this.initPosition = initPosition;
    }

    public String getHoliable() {
        return holiable;
    }

    public void setHoliable(String holiable) {
        this.holiable = holiable == null ? null : holiable.trim();
    }

    public Date getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(Date validStartDate) {
        this.validStartDate = validStartDate;
    }

    public String getRecState() {
        return recState;
    }

    public void setRecState(String recState) {
        this.recState = recState == null ? null : recState.trim();
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
}