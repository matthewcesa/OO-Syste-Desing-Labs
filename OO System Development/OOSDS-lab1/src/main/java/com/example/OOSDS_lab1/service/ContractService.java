package com.example.OOSDS_lab1.service;

import com.example.OOSDS_lab1.entity.Car;
import com.example.OOSDS_lab1.entity.Contract;
import com.example.OOSDS_lab1.entity.Person;
import com.example.OOSDS_lab1.service.Interface.ContractInterface;

import java.util.ArrayList;
import java.util.List;

public class ContractService implements ContractInterface {

    List<Contract> contracts = new ArrayList<>();

    @Override
    public Contract getContractByPerson(Person person) {
        Contract contract = null;
        for (Contract c : contracts){
            if (c.getPerson() == person){
                contract = c;
            }
        }
        return contract;
    }

    @Override
    public Contract getByNameAndSurname(String name, String surname) {
        Contract contract = null;
        for (Contract c : contracts){
            if (c.getPerson().getName().equals(name) && c.getPerson().getSurname().equals(surname)){
                contract = c;
            }
        }
        return contract;
    }

    @Override
    public Contract getByCar(Car car) {
        Contract contract = null;
        for (Contract c : contracts){
            if (c.getCar() == car){
                contract = c;
            }
        }
        return contract;
    }
}
