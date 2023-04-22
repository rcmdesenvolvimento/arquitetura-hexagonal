package com.rcm.sistemas.arquiteturahexagonal.application.ports.in;

import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
