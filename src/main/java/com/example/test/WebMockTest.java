package com.example.test;

import com.example.slsinterview.SlsInterviewApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes=SlsInterviewApplication.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SlsInterviewApplication service;

    @Test
    public void sumShouldReturnMessageFromService() throws Exception {
        when(service.sum(14)).thenReturn(3);
        this.mockMvc.perform(get("/sum?myNumber=14")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("3"));
    }

    @Test
    public void multiplyShouldReturnMessageFromService() throws Exception {
        when(service.multiply(39)).thenReturn(1);
        this.mockMvc.perform(get("/multiply?myNumber=39")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("1"));
    }
}