package com.dsmanioto.address.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AddressControllerIT {

    private static final String CONTENT_TYPE = "application/json;charset=UTF8";

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private AddressController addressController;

    @Before
    public void setup() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testAddressByCepNormal() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .get("/address/cep/{1}", "13469130")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.uf").value("SP"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.cep").value("13469-130"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.bairro").value("Vila Amorim"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.localidade").value("Americana"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.logradouro").value("Rua Vicente de Carvalho"));
    }

}
