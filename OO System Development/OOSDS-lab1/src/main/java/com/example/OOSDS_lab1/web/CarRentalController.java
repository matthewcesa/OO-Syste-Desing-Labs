package com.example.OOSDS_lab1.web;

import com.example.OOSDS_lab1.data.Car;
import com.example.OOSDS_lab1.data.PlateNumber;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarRentalController {


    Car car1 = new Car(new PlateNumber("11AA22", "11-11-2017", "1/1/2018") , 100, "Ferrari");
    Car car2 = new Car(new PlateNumber("22BB33" , "11-11-2017", "1/1/2018"), 500, "Tesla");

    List<Car> cars = new ArrayList<>();


    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfCars(){

    }
}