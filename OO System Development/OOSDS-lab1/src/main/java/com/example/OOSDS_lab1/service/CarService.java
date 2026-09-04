package com.example.OOSDS_lab1.service;

import com.example.OOSDS_lab1.entity.Car;
import com.example.OOSDS_lab1.entity.Dates;
import com.example.OOSDS_lab1.service.Interface.CarInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarInterface {

    private List<Car> cars = new ArrayList<>();

    @Autowired
    public CarService(){
        cars.add(new Car("11AA22", "Ferrari", 100));
        cars.add(new Car("AA11BB", "Porsche", 120));
    }
    public List<Car> getAllCars(){return cars;}

    @Override
    public Car getCarByPlateNumber(String pN){
        for (Car car : cars){
            if (car.getPlateNumber().equals(pN)){
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getAvailableCars(){
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars){
            if(!car.isRent()){
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    @Override
    public void rentOrGetBack(String plateNumber, String debutDate, String endDate){
        Car car = this.getCarByPlateNumber(plateNumber);
        if (!car.isRent()){
            car.setRent(true);
            car.setDate(new Dates(debutDate,endDate));
        }else{
            car.setRent(false);
            car.setDate(null);
        }
    }

}
