package org.example.hospital.model;

public abstract class Doctor extends Characters {
    private String licenseId;

    protected Doctor(String id, String fullName, int age, String licenseId) {
        super(id, fullName, age);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
