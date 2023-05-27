package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userData")
public class User {
    @Id
    @GeneratedValue
    private Integer num;
    private String firstName;
    private String lastName;
    private Long mobile;
    private String age;
    private String email;
    private String password;
    private String pdfFilePath;
    private String imageFilePath;
    private String address;
    private String occupation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPdfFilePath() {
        return pdfFilePath;
    }

    public void setPdfFilePath(String pdfFilePath) {
        this.pdfFilePath = pdfFilePath;
    }

    public String getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    @Override
    public String toString() {
        return "User{" +
                "num=" + num +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile=" + mobile +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", pdfFilePath='" + pdfFilePath + '\'' +
                ", imageFilePath='" + imageFilePath + '\'' +
                ", address='" + address + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
