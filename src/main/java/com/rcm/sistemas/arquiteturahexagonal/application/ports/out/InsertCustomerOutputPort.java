package com.rcm.sistemas.arquiteturahexagonal.application.ports.out;

import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
