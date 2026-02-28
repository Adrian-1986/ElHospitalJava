package org.example.hospital.doctor;

import org.example.hospital.interfaces.SpecialistDuties;
import org.example.hospital.model.Doctor;

public class SpecialistDoctor extends Doctor implements SpecialistDuties {
    private int weeklyWorkHours;
    private int vacationDaysPerYear;
    private String specialty;

    public SpecialistDoctor(String id, String fullName, int age, String licenseId,
                            int weeklyWorkHours, int vacationDaysPerYear, String specialty) {
        super(id, fullName, age, licenseId);
        this.weeklyWorkHours = weeklyWorkHours;
        this.vacationDaysPerYear = vacationDaysPerYear;
        this.specialty = specialty;
    }

    public void setWeeklyWorkHours(int weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }

    public void setVacationDaysPerYear(int vacationDaysPerYear) {
        this.vacationDaysPerYear = vacationDaysPerYear;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public int weeklyWorkHours() {
        return weeklyWorkHours;
    }

    @Override
    public String eat() {
        return "Specialist doctor " + getFullName() + " is eating";
    }

    @Override
    public int vacationDaysPerYear() {
        return vacationDaysPerYear;
    }

    @Override
    public String specialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "SpecialistDoctor{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", licenseId='" + getLicenseId() + '\'' +
                ", weeklyWorkHours=" + weeklyWorkHours +
                ", vacationDaysPerYear=" + vacationDaysPerYear +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
