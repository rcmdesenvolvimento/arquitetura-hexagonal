package com.rcm.sistemas.arquiteturahexagonal.adapters.in.controller.mapper;

import com.rcm.sistemas.arquiteturahexagonal.adapters.in.controller.request.CustomerRequest;
import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
