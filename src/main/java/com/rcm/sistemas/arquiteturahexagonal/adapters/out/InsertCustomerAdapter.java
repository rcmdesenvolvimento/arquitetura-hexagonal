package com.rcm.sistemas.arquiteturahexagonal.adapters.out;

import com.rcm.sistemas.arquiteturahexagonal.adapters.out.repository.CustomerRepository;
import com.rcm.sistemas.arquiteturahexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;
import com.rcm.sistemas.arquiteturahexagonal.application.ports.out.InsertCustomerOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
