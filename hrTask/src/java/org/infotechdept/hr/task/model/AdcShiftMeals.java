package org.infotechdept.hr.task.model;

import java.util.Date;

public class AdcShiftMeals {
    private Long id;

    private Date mealsDate;

    private String deptid;

    private Long empid;

    private String roomId;

    private String mealsType;

    private Integer mealsTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMealsDate() {
        return mealsDate;
    }

    public void setMealsDate(Date mealsDate) {
        this.mealsDate = mealsDate;
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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getMealsType() {
        return mealsType;
    }

    public void setMealsType(String mealsType) {
        this.mealsType = mealsType == null ? null : mealsType.trim();
    }

    public Integer getMealsTimes() {
        return mealsTimes;
    }

    public void setMealsTimes(Integer mealsTimes) {
        this.mealsTimes = mealsTimes;
    }
}