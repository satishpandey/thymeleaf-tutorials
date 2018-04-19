package com.cloudtechpro.thymeleaf;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.cloudtechpro.thymeleaf.controller.ContentController;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ContentController.class)
public class ContentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void displayDefaultName() throws Exception {
        mockMvc.perform(get("/display-name"))
                .andExpect(content().string(containsString("Hello, Cloudtechpro!")));
    }

    @Test
    public void displayParameterName() throws Exception {
        mockMvc.perform(get("/display-name").param("name", "Satish"))
                .andExpect(content().string(containsString("Hello, Satish!")));
    }

}
