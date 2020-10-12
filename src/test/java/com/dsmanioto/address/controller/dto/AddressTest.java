package com.dsmanioto.address.controller.dto;

import com.dsmanioto.address.controller.dto.request.AddressDTO;
import org.assertj.core.util.Strings;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddressTest {

    @Test
    public void testDtoAddres() {
        final AddressDTO dto = AddressDTO.builder()
                .cep("13468192")
                .street("Rua Das Oliveiras")
                .information("")
                .neighborhood("Parque das Nações")
                .city("Americana")
                .state("SP")
                .build();

        Assert.assertEquals("13468192", dto.getCep());
        Assert.assertEquals("Rua Das Oliveiras", dto.getStreet());
        Assert.assertEquals("Parque das Nações", dto.getNeighborhood());
        Assert.assertTrue(Strings.isNullOrEmpty(dto.getInformation()));
        Assert.assertEquals("Americana", dto.getCity());
        Assert.assertEquals("SP", dto.getState());
    }

}
