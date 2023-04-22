package com.rcm.sistemas.arquiteturahexagonal.adapters.out.repository.mapper;

import com.rcm.sistemas.arquiteturahexagonal.adapters.out.repository.entity.CustomerEntity;
import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
