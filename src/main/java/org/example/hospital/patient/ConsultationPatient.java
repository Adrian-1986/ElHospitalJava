package org.example.hospital.patient;

import org.example.hospital.interfaces.ConsultationFlow;
import org.example.hospital.model.Patient;

public class ConsultationPatient extends Patient implements ConsultationFlow {
    public ConsultationPatient(String id, String fullName, int age, String condition, String roomNumber) {
        super(id, fullName, age, condition, roomNumber);
    }

    @Override
    public String admission() {
        return "Admission completed for consultation patient " + getFullName();
    }

    @Override
    public String nurseCheck() {
        return "Nurse check completed for " + getFullName();
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
    public String nextAppointment() {
        return "Next appointment scheduled for " + getFullName();
    }

    @Override
    public String discharge() {
        return "Discharge completed for " + getFullName();
    }

    @Override
    public String toString() {
        return "ConsultationPatient{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", condition='" + getCondition() + '\'' +
                ", roomNumber='" + getRoomNumber() + '\'' +
                '}';
    }
}
