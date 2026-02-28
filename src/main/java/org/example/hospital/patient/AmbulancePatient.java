package org.example.hospital.patient;

import org.example.hospital.interfaces.AmbulanceFlow;
import org.example.hospital.model.Patient;

public class AmbulancePatient extends Patient implements AmbulanceFlow {
    private String injuryType;

    public AmbulancePatient(String id, String fullName, int age, String condition, String roomNumber, String injuryType) {
        super(id, fullName, age, condition, roomNumber);
        this.injuryType = injuryType;
    }

    public String getInjuryType() {
        return injuryType;
    }

    public void setInjuryType(String injuryType) {
        this.injuryType = injuryType;
    }

    @Override
    public String admission() {
        return "Emergency admission completed for " + getFullName();
    }

    @Override
    public String operation() {
        return "Operation scheduled for injury: " + injuryType;
    }

    @Override
    public String roomAssignment() {
        return "Assigned to room " + getRoomNumber();
    }

    @Override
    public String treatment() {
        return "Treatment started for " + getCondition();
    }

    @Override
    public String rehabilitation() {
        return "Rehabilitation started for " + getFullName();
    }

    @Override
    public String discharge() {
        return "Discharge completed for " + getFullName();
    }

    @Override
    public String toString() {
        return "AmbulancePatient{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", condition='" + getCondition() + '\'' +
                ", roomNumber='" + getRoomNumber() + '\'' +
                ", injuryType='" + injuryType + '\'' +
                '}';
    }
}
