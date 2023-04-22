package com.rcm.sistemas.arquiteturahexagonal.adapters.in.controller;

import com.rcm.sistemas.arquiteturahexagonal.adapters.out.FindAddressByZipCodeAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    private FindAddressByZipCodeAdapter findAddressByZipCodeAdapter;
}