package org.example.hospital;

import org.example.hospital.doctor.SpecialistDoctor;
import org.example.hospital.doctor.StudentDoctor;
import org.example.hospital.interfaces.AmbulanceFlow;
import org.example.hospital.interfaces.ConsultationFlow;
import org.example.hospital.interfaces.SpecialistDuties;
import org.example.hospital.interfaces.StudentDuties;
import org.example.hospital.model.Doctor;
import org.example.hospital.model.Patient;
import org.example.hospital.patient.AmbulancePatient;
import org.example.hospital.patient.ConsultationPatient;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient consultation1 = new ConsultationPatient("P-001", "Laura Perez", 28, "Allergy", "C-101");
        Patient consultation2 = new ConsultationPatient("P-002", "Carlos Ruiz", 35, "Headache", "C-102");
        Patient ambulance1 = new AmbulancePatient("P-003", "Maria Gomez", 42, "Fracture", "E-201", "Leg fracture");
        Patient ambulance2 = new AmbulancePatient("P-004", "Jose Martinez", 50, "Trauma", "E-202", "Car accident");

        Doctor specialist1 = new SpecialistDoctor("D-001", "Dr. Ana Lopez", 45, "LIC-1001",
                40, 20, "Cardiology");
        Doctor specialist2 = new SpecialistDoctor("D-002", "Dr. Luis Herrera", 39, "LIC-1002",
                38, 18, "Neurology");
        Doctor student1 = new StudentDoctor("D-003", "Dr. Sofia Diaz", 27, "LIC-2001",
                30, 15, "Internal Medicine I");
        Doctor student2 = new StudentDoctor("D-004", "Dr. Pedro Silva", 26, "LIC-2002",
                28, 18, "Surgery Basics");

        List<Patient> patients = List.of(consultation1, consultation2, ambulance1, ambulance2);
        List<Doctor> doctors = List.of(specialist1, specialist2, student1, student2);

        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }

        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        ConsultationFlow consultationFlow = (ConsultationFlow) consultation1;
        AmbulanceFlow ambulanceFlow = (AmbulanceFlow) ambulance1;
        SpecialistDuties specialistDuties = (SpecialistDuties) specialist1;
        StudentDuties studentDuties = (StudentDuties) student1;

        System.out.println(consultationFlow.admission());
        System.out.println(ambulanceFlow.operation());
        System.out.println("Specialty: " + specialistDuties.specialty());
        System.out.println("Current course: " + studentDuties.currentCourse());
    }
}
