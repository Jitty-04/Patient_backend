package com.nest.patient_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patients")
public class Patients {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String gender;
    private String address;
    private String mb;
    private String date;
    private String doctorname;

    public Patients() {
    }

    public Patients(int id, String name, String gender, String address, String mb, String date, String doctorname) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.mb = mb;
        this.date = date;
        this.doctorname = doctorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}
