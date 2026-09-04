package com.example.OOSDS_lab1.service.Interface;

import com.example.OOSDS_lab1.entity.Car;
import com.example.OOSDS_lab1.entity.Contract;
import com.example.OOSDS_lab1.entity.Person;

public interface ContractInterface {

    public Contract getContractByPerson(Person person);
    public Contract getByNameAndSurname(String name, String surname);

    public Contract getByCar(Car car);
}
