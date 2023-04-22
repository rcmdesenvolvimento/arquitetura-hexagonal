package com.rcm.sistemas.arquiteturahexagonal.application.ports.out;

import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
