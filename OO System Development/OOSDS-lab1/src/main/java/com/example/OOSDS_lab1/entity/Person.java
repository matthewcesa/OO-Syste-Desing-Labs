package com.example.OOSDS_lab1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Collection;

@Entity
public class Person {

    @Id
    private Long id;
    private String name;
    private String surname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private Collection<Contract> contracts;

    public Collection<Contract> getContracts(){
        return this.contracts;
    }

    public void setContracts(Collection<Contract> cont){this.contracts = cont;}

    public void addContract(Contract contract){
        this.contracts.add(contract);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
