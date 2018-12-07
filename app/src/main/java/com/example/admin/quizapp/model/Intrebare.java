package com.example.admin.quizapp.model;

public class Intrebare {

    private String Text;
    private String Raspuns1;
    private String Raspuns2;
    private String Raspuns3;
    private String Raspuns4;
    private String RaspunsCorect;


    public Intrebare() {

    }

    public Intrebare(String text, String raspuns1, String raspuns2, String raspuns3, String raspuns4, String raspunsCorect) {
        Text = text;
        Raspuns1 = raspuns1;
        Raspuns2 = raspuns2;
        Raspuns3 = raspuns3;
        Raspuns4 = raspuns4;
        RaspunsCorect = raspunsCorect;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getRaspuns1() {
        return Raspuns1;
    }

    public void setRaspuns1(String raspuns1) {
        Raspuns1 = raspuns1;
    }

    public String getRaspuns2() {
        return Raspuns2;
    }

    public void setRaspuns2(String raspuns2) {
        Raspuns2 = raspuns2;
    }

    public String getRaspuns3() {
        return Raspuns3;
    }

    public void setRaspuns3(String raspuns3) {
        Raspuns3 = raspuns3;
    }

    public String getRaspuns4() {
        return Raspuns4;
    }

    public void setRaspuns4(String raspuns4) {
        Raspuns4 = raspuns4;
    }

    public String getRaspunsCorect() {
        return RaspunsCorect;
    }

    public void setRaspunsCorect(String raspunsCorect) {
        RaspunsCorect = raspunsCorect;
    }
}
