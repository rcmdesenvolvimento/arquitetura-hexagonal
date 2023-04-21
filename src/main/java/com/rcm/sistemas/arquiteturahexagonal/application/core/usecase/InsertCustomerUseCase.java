package com.rcm.sistemas.arquiteturahexagonal.application.core.usecase;

import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;
import com.rcm.sistemas.arquiteturahexagonal.application.ports.out.FindAdrressByZipCodeOutputPort;
import com.rcm.sistemas.arquiteturahexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAdrressByZipCodeOutputPort findAdrressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerUseCase;

    public InsertCustomerUseCase(FindAdrressByZipCodeOutputPort findAdrressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerUseCase) {
        this.findAdrressByZipCodeOutputPort = findAdrressByZipCodeOutputPort;
        this.insertCustomerUseCase = insertCustomerUseCase;
    }

    public void insert(Customer customer, String zipCode) {
        var address = findAdrressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerUseCase.insert(customer);
    }
}
