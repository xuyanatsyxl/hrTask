package org.infotechdept.hr.task.model;

public class AdcShiftPatternDetail extends AdcShiftPatternDetailKey {
    private String shiftId;

    private String sortNo;

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId == null ? null : shiftId.trim();
    }

    public String getSortNo() {
        return sortNo;
    }

    public void setSortNo(String sortNo) {
        this.sortNo = sortNo == null ? null : sortNo.trim();
    }
}