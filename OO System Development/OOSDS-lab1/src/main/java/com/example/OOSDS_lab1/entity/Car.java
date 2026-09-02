package com.example.OOSDS_lab1.entity;

import jakarta.persistence.*;


@Entity
public class Car {

    @Id
    private String plateNumber;
    private String brand;
    private int price;
    private boolean isRent;

    @OneToOne
    @JoinColumn(name = "date_id")
    private Dates dates;

    public Car(){}
    public Car(String plateNumber, String brand, int price){
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.isRent = false;
        this.dates = null;
    }

    public String toString(){
        if (this.isRent){
            return "[PlateNumber: " + this.plateNumber + " - brand: " + this.brand + " - price: " + this.price + " - dates ->" + this.getDate() + "].";
        }
        return "[PlateNumber: " + this.plateNumber + " - brand: " + this.brand + " - price: " + this.price + "].";
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setDate(Dates dates) {
        this.dates = dates;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public Dates getDate() {
        return dates;
    }

    public int getPrice() {
        return price;
    }

    public boolean isRent() {
        return isRent;
    }
}
