package com.dsmanioto.address.dsaddressapi.controller;

import com.dsmanioto.address.dsaddressapi.dto.AddressDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/{cep}")
    public ResponseEntity<AddressDTO> findByCEP(@PathVariable("cep") String cep) {

        RestTemplate restTemplate = new RestTemplate();

        AddressDTO address = restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json/unicode/", AddressDTO.class);

        return ResponseEntity.ok(address);
    }

}
