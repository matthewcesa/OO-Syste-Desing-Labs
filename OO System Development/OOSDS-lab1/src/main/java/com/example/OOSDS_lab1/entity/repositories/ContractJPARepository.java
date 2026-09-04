package com.example.OOSDS_lab1.entity.repositories;

import com.example.OOSDS_lab1.entity.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractJPARepository extends CrudRepository<Contract, Long> {
}
