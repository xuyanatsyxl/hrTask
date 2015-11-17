package org.infotechdept.hr.task.model;

public class AdcDinnerRoomDkj {
    private Long id;

    private String roomId;

    private String dkjid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getDkjid() {
        return dkjid;
    }

    public void setDkjid(String dkjid) {
        this.dkjid = dkjid == null ? null : dkjid.trim();
    }
}