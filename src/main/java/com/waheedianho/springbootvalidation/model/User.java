package com.waheedianho.springbootvalidation.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "username cannot be emplty")
    private String username;
    @NotBlank (message = "password can not be empty")
    private String pswrd;
    @Email (message = "Enter a valid email address")
    private String email;
    private Double grade;


    public User(String username, String pswrd, String email, Double grade) {
        this.username = username;
        this.pswrd = pswrd;
        this.email = email;
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswrd() {
        return pswrd;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
