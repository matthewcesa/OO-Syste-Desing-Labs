package com.example.OOSDS_lab1.service.Interface;

import com.example.OOSDS_lab1.entity.Car;
import com.example.OOSDS_lab1.service.exception.CarException;

import java.util.List;

public interface CarInterface {

    public Car getCarByPlateNumber(String pN) throws CarException;

    public List<Car> getAvailableCars();

    public void rentOrGetBack(String plateNumber, String debutDate, String endDate);
}
