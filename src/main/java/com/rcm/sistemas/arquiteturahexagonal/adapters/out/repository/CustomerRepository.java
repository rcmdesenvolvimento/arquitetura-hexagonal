package com.rcm.sistemas.arquiteturahexagonal.adapters.out.repository;

import com.rcm.sistemas.arquiteturahexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
