package com.example.OOSDS_lab1.service;

import com.example.OOSDS_lab1.repository.Car;
import com.example.OOSDS_lab1.repository.Date;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {


    private List<Car> cars = new ArrayList<>();

    public CarService(){
        cars.add(new Car("11AA22", "Ferrari", 100));
        cars.add(new Car("AA11BB", "Porsche", 120));
    }
    public List<Car> getAllCars(){return cars;}
    public Car getCarByPlateNumber(String pN){
        for (Car car : cars){
            if (car.getPlateNumber().equals(pN)){
                return car;
            }
        }
        return null;
    }

    public List<Car> getAvailableCars(){
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars){
            if(!car.isRent()){
                availableCars.add(car);
            }
        }
        return availableCars;
    }
    public void rentOrGetBack(String plateNumber, String debutDate, String endDate){
        Car car = this.getCarByPlateNumber(plateNumber);
        if (!car.isRent()){
            car.setRent(true);
            car.setDate(new Date(debutDate,endDate));
        }else{
            car.setRent(false);
            car.setDate(null);
        }
    }

}
