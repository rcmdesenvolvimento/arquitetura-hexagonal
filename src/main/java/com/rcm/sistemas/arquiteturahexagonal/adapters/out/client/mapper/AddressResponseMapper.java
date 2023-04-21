package com.rcm.sistemas.arquiteturahexagonal.adapters.out.client.mapper;

import com.rcm.sistemas.arquiteturahexagonal.adapters.out.client.response.AddressResponse;
import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);

}
