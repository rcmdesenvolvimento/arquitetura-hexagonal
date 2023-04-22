package com.rcm.sistemas.arquiteturahexagonal.adapters.in.controller;

import com.rcm.sistemas.arquiteturahexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.rcm.sistemas.arquiteturahexagonal.adapters.in.controller.request.CustomerRequest;
import com.rcm.sistemas.arquiteturahexagonal.application.ports.in.InsertCustomerInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    // Essa classe se encontra em apllication/ports/in
    private final InsertCustomerInputPort insertCustomerInputPort;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

}