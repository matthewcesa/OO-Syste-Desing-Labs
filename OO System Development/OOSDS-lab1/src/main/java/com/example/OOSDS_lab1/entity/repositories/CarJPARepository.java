package com.example.OOSDS_lab1.entity.repositories;

import com.example.OOSDS_lab1.entity.Car;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarJPARepository extends CrudRepository<Car, String> {

    List<Car> findByPlateNumber(String plateNumber);

}
