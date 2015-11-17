package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcHolidayDetail {
    private Long id;

    private String hCode;

    private Date hDate;

    private Date stringDate;

    private String adcId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gethCode() {
        return hCode;
    }

    public void sethCode(String hCode) {
        this.hCode = hCode == null ? null : hCode.trim();
    }

    public Date gethDate() {
        return hDate;
    }

    public void sethDate(Date hDate) {
        this.hDate = hDate;
    }

    public Date getStringDate() {
        return stringDate;
    }

    public void setStringDate(Date stringDate) {
        this.stringDate = stringDate;
    }

    public String getAdcId() {
        return adcId;
    }

    public void setAdcId(String adcId) {
        this.adcId = adcId == null ? null : adcId.trim();
    }
}