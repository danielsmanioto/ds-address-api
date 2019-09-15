package com.dsmanioto.address.dsaddressapi.controller;

import com.dsmanioto.address.dsaddressapi.dto.AddressDTO;
import com.dsmanioto.address.dsaddressapi.service.impl.ViaCEPImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private ViaCEPImpl viaCEPService;

    @GetMapping("/cep/{cep}")
    public ResponseEntity<AddressDTO> findByCep(@PathVariable("cep") String cep) {
        AddressDTO address = viaCEPService.findAddressByCep(cep);

        return ResponseEntity.ok(address);
    }

}
