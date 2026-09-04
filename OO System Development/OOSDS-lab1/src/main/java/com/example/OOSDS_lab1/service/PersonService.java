package com.example.OOSDS_lab1.service;

import com.example.OOSDS_lab1.entity.Person;
import com.example.OOSDS_lab1.service.Interface.PersonInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonService implements PersonInterface {

    List<Person> persons = new ArrayList<>();
    @Override
    public Person getPersonByName(String name) {
        Person p = null;
        for (Person person : persons){
            if (person.getName().equals(name)){
                p = person;
            }
        }
        return p;
    }

    @Override
    public Person getPersonByNameAndSurname(String name, String surname) {
        Person p = null;
        for (Person person : persons){
            if (person.getName().equals(name) && person.getSurname().equals(surname)){
                p = person;
            }
        }
        return p;
    }
}
