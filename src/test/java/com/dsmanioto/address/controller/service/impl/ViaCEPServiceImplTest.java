package com.dsmanioto.address.controller.service.impl;

import com.dsmanioto.address.controller.dto.request.AddressDTO;
import com.dsmanioto.address.service.impl.ViaCEPServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ViaCEPServiceImplTest {

    @Mock
    private ViaCEPServiceImpl viaCEPService;

    @Test
    public void checkFindExistentCep() {
        BDDMockito
                .given(viaCEPService.findAddressByCep("11111000"))
                .willReturn(createExistentCEP());

        AddressDTO addressByCep = viaCEPService.findAddressByCep("11111000");

        Assertions.assertEquals("11111000", addressByCep.getCep());
        Assertions.assertEquals("Americana", addressByCep.getCity());
        Assertions.assertEquals("Centro", addressByCep.getNeighborhood());
        Assertions.assertEquals("SP", addressByCep.getState());
        Assertions.assertEquals("Rua dos bobos", addressByCep.getStreet());
        Assertions.assertEquals("---", addressByCep.getInformation());

    }

    private AddressDTO createExistentCEP() {
        return AddressDTO.builder()
                .cep("11111000")
                .city("Americana")
                .neighborhood("Centro")
                .state("SP")
                .street("Rua dos bobos")
                .information("---")
                .build();
    }

}
