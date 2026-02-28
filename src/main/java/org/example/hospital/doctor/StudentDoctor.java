package org.example.hospital.doctor;

import org.example.hospital.interfaces.StudentDuties;
import org.example.hospital.model.Doctor;

public class StudentDoctor extends Doctor implements StudentDuties {
    private int weeklyWorkHours;
    private int weeklyStudyHours;
    private String currentCourse;

    public StudentDoctor(String id, String fullName, int age, String licenseId,
                         int weeklyWorkHours, int weeklyStudyHours, String currentCourse) {
        super(id, fullName, age, licenseId);
        this.weeklyWorkHours = weeklyWorkHours;
        this.weeklyStudyHours = weeklyStudyHours;
        this.currentCourse = currentCourse;
    }

    public void setWeeklyWorkHours(int weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }

    public int getWeeklyWorkHours() {
        return weeklyWorkHours;
    }

    public void setWeeklyStudyHours(int weeklyStudyHours) {
        this.weeklyStudyHours = weeklyStudyHours;
    }

    public int getWeeklyStudyHours() {
        return weeklyStudyHours;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    @Override
    public int weeklyWorkHours() {
        return weeklyWorkHours;
    }

    @Override
    public int weeklyStudyHours() {
        return weeklyStudyHours;
    }

    @Override
    public String eat() {
        return "Student doctor " + getFullName() + " is eating";
    }

    @Override
    public String currentCourse() {
        return currentCourse;
    }

    @Override
    public String toString() {
        return "StudentDoctor{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", licenseId='" + getLicenseId() + '\'' +
                ", weeklyWorkHours=" + weeklyWorkHours +
                ", weeklyStudyHours=" + weeklyStudyHours +
                ", currentCourse='" + currentCourse + '\'' +
                '}';
    }
}
