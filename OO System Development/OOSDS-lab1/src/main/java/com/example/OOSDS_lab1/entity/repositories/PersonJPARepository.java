package com.example.OOSDS_lab1.entity.repositories;

import com.example.OOSDS_lab1.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonJPARepository extends CrudRepository<Person, Long> {
}
