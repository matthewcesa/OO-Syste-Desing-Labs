package com.example.OOSDS_lab1;


public class PlateNumber {

    protected String number;
    protected Date date;


    public PlateNumber(String number, String dateDebut, String dateFin) {
        this.number = number;
        this.date = new Date(dateDebut,dateFin);
    }
}