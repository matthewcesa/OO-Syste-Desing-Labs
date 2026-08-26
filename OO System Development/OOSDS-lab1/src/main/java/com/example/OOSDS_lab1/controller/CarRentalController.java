package com.example.OOSDS_lab1.controller;


import com.example.OOSDS_lab1.repository.Car;
import com.example.OOSDS_lab1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.OOSDS_lab1.repository.Date;

import java.util.List;

@RestController
@RequestMapping("/")
public class CarRentalController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Car getCar(@PathVariable("plateNumber") String plateNumber) throws Exception {
        return carService.getCarByPlateNumber(plateNumber);
    }

    @PutMapping(value = "cars/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void rentOrGetBack(@PathVariable("plateNumber") String plateNumber,
    @RequestParam(value = "rent", required = true) boolean rent,
    @RequestBody Date dates) throws Exception {

        carService.rentOrGetBack(plateNumber, dates.getDateDebut(), dates.getDateFin());
    }

}