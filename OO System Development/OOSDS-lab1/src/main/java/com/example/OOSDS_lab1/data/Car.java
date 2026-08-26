package com.example.OOSDS_lab1.data;

public class Car {

    public PlateNumber plateNumber;
    private int price;
    private String brand;

    public Car(PlateNumber plateNumber, int price, String brand){
        this.plateNumber = plateNumber;
        this.price = price;
        this.brand = brand;
    }

    public String toString(){
        return "[PlateNumber : " + this.plateNumber + " - Brand : " + this.brand + " - Price : " + this.price + "e].";
    }




    }


}
