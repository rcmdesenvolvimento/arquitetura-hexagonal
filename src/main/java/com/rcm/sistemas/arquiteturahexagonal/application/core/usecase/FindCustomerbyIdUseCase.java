package com.rcm.sistemas.arquiteturahexagonal.application.core.usecase;

import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;
import com.rcm.sistemas.arquiteturahexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerbyIdUseCase {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerbyIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }


    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
