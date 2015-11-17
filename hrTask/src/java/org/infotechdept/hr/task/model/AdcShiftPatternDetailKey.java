package org.infotechdept.hr.task.model;

public class AdcShiftPatternDetailKey {
    private Integer positionId;

    private String patternId;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId == null ? null : patternId.trim();
    }
}