package com.rcm.sistemas.arquiteturahexagonal.adapters.out;

import com.rcm.sistemas.arquiteturahexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.rcm.sistemas.arquiteturahexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Address;
import com.rcm.sistemas.arquiteturahexagonal.application.ports.out.FindAdrressByZipCodeOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAdrressByZipCodeOutputPort {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
