package com.example.OOSDS_lab1.service;

import com.example.OOSDS_lab1.entity.Person;

public interface PersonInterface {

    public Person getPersonByName(String name);

    public Person getPersonByNameAndSurname(String name, String surname);
}
