package com.dsmanioto.address.controller;

import com.dsmanioto.address.dto.AddressDTO;
import com.dsmanioto.address.service.impl.ViaCEPImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Address")
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private ViaCEPImpl viaCEPService;

    @ApiOperation("Find address by Brasilian CEP")
    @ApiResponses(value = @ApiResponse(code = 200, message = "OK"))
    @GetMapping("/protected/cep/{cep}")
    public ResponseEntity<AddressDTO> findByCep(@PathVariable("cep") String cep) {
        AddressDTO address = viaCEPService.findAddressByCep(cep);

        return ResponseEntity.ok(address);
    }

}
