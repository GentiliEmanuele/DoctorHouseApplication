package com.example.doctorhouse;

public class LoginController {
    private String email, password;

    public LoginController(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean validate() {
        return true;
    }

    @Override
    public String toString() {
        return "LoginController{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
