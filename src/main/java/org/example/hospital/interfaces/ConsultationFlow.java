package org.example.hospital.interfaces;

public interface ConsultationFlow {
    String admission();
    String nurseCheck();
    String roomAssignment();
    String treatment();
    String nextAppointment();
    String discharge();
}
