package com.example.OOSDS_lab1.repository;


public class Car {

    private String plateNumber;
    private String brand;
    private int price;
    private boolean isRent;
    private Date date;

    public Car(){}
    public Car(String plateNumber, String brand, int price){
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.isRent = false;
        this.date = null;
    }

    public String toString(){
        if (this.isRent){
            return "[PlateNumber: " + this.plateNumber + " - brand: " + this.brand + " - price: " + this.price + " - date ->" + this.getDate() + "].";
        }
        return "[PlateNumber: " + this.plateNumber + " - brand: " + this.brand + " - price: " + this.price + "].";
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public boolean isRent() {
        return isRent;
    }
}
