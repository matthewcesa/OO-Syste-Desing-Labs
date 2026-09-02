package com.example.OOSDS_lab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dates {

    @Id
    private String dateDebut;
    private String dateFin;

    public Dates(){}
    public Dates(String dateDebut, String dateFin){
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String toString(){
        return "beginning date: " + this.dateDebut + " - ending date:" + this.dateFin;
    }

    public String getDateDebut() {return dateDebut;}
    public String getDateFin() {return dateFin;}
    public void setDateDebut(String db){this.dateDebut = db;}
    public void setDateFin(String fin){this.dateFin = fin;}
}
