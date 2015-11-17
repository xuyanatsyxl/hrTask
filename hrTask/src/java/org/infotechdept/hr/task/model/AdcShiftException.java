package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftException {
    private Long id;

    private Date exceptionDate;

    private String deptid;

    private Long empid;

    private String code;

    private Long schId;

    private String exceptionField;

    private Date checkTime;

    private Date actualCheckTime;

    private String procState;

    private String adcId;

    private String procMemo;

    private String operator;

    private Date operateTime;

    private Integer requestid;

    private Integer ftriggerflag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExceptionDate() {
        return exceptionDate;
    }

    public void setExceptionDate(Date exceptionDate) {
        this.exceptionDate = exceptionDate;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getSchId() {
        return schId;
    }

    public void setSchId(Long schId) {
        this.schId = schId;
    }

    public String getExceptionField() {
        return exceptionField;
    }

    public void setExceptionField(String exceptionField) {
        this.exceptionField = exceptionField == null ? null : exceptionField.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getActualCheckTime() {
        return actualCheckTime;
    }

    public void setActualCheckTime(Date actualCheckTime) {
        this.actualCheckTime = actualCheckTime;
    }

    public String getProcState() {
        return procState;
    }

    public void setProcState(String procState) {
        this.procState = procState == null ? null : procState.trim();
    }

    public String getAdcId() {
        return adcId;
    }

    public void setAdcId(String adcId) {
        this.adcId = adcId == null ? null : adcId.trim();
    }

    public String getProcMemo() {
        return procMemo;
    }

    public void setProcMemo(String procMemo) {
        this.procMemo = procMemo == null ? null : procMemo.trim();
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

    public Integer getRequestid() {
        return requestid;
    }

    public void setRequestid(Integer requestid) {
        this.requestid = requestid;
    }

    public Integer getFtriggerflag() {
        return ftriggerflag;
    }

    public void setFtriggerflag(Integer ftriggerflag) {
        this.ftriggerflag = ftriggerflag;
    }
}