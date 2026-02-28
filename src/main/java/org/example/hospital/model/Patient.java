package org.example.hospital.model;

public abstract class Patient extends Characters {
    private String condition;
    private String roomNumber;

    protected Patient(String id, String fullName, int age, String condition, String roomNumber) {
        super(id, fullName, age);
        this.condition = condition;
        this.roomNumber = roomNumber;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
