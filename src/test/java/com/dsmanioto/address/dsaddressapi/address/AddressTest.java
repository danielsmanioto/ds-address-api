package com.dsmanioto.address.dsaddressapi.address;

import com.dsmanioto.address.dsaddressapi.dto.AddressDTO;
import com.dsmanioto.address.dsaddressapi.dto.AddressDTOBuilder;
import org.assertj.core.util.Strings;
import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testDtoAddres() {
        final AddressDTO dto = new AddressDTOBuilder()
                .setCep("13468192")
                .setStreet("Rua Das Oliveiras")
                .setInformation("")
                .setNeighborhood("Parque das Nações")
                .setCity("Americana")
                .setState("SP")
                .createAddressDTO();

        Assert.assertEquals("13468192", dto.getCep());
        Assert.assertEquals("Rua Das Oliveiras", dto.getStreet());
        Assert.assertEquals("Parque das Nações", dto.getNeighborhood());
        Assert.assertTrue(Strings.isNullOrEmpty(dto.getInformation()));
        Assert.assertEquals("Americana", dto.getCity());
        Assert.assertEquals("SP", dto.getState());
    }

}
