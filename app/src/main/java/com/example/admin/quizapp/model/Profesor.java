package com.example.admin.quizapp.model;

import java.io.Serializable;

public class Profesor implements Serializable {
    private String email;
    private String parola;

    public Profesor(String email, String parola) {
        this.email = email;
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "email='" + email + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }
}