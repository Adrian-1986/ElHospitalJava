package org.example.hospital.model;

public abstract class Doctor extends Character {
    private String licenseId;

    protected Doctor(String fullName, int age, String licenseId) {
        super(fullName, age);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
