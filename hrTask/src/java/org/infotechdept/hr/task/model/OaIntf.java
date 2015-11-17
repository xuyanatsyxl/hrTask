package org.infotechdept.hr.task.model;

public class OaIntf {
    private Long id;

    private String ksrq;

    private String kssj;

    private String jsrq;

    private String jssj;

    private String workcode;

    private String cllx;

    private String clbz;

    private Long requestid;

    private String writeDate;

    private String writeTime;

    private String txrcode;

    private Float days;

    private Float hours;

    private String state;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKsrq() {
        return ksrq;
    }

    public void setKsrq(String ksrq) {
        this.ksrq = ksrq == null ? null : ksrq.trim();
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj == null ? null : kssj.trim();
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq == null ? null : jsrq.trim();
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj == null ? null : jssj.trim();
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode == null ? null : workcode.trim();
    }

    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx == null ? null : cllx.trim();
    }

    public String getClbz() {
        return clbz;
    }

    public void setClbz(String clbz) {
        this.clbz = clbz == null ? null : clbz.trim();
    }

    public Long getRequestid() {
        return requestid;
    }

    public void setRequestid(Long requestid) {
        this.requestid = requestid;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate == null ? null : writeDate.trim();
    }

    public String getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(String writeTime) {
        this.writeTime = writeTime == null ? null : writeTime.trim();
    }

    public String getTxrcode() {
        return txrcode;
    }

    public void setTxrcode(String txrcode) {
        this.txrcode = txrcode == null ? null : txrcode.trim();
    }

    public Float getDays() {
        return days;
    }

    public void setDays(Float days) {
        this.days = days;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}