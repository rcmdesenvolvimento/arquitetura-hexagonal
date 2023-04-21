package com.rcm.sistemas.arquiteturahexagonal.application.ports.out;

import com.rcm.sistemas.arquiteturahexagonal.application.core.domain.Address;

public interface FindAdrressByZipCodeOutputPort {
    Address find(String zipCode);
}
