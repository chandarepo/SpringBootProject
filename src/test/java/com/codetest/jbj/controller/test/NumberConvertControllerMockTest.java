package com.codetest.jbj.controller.test;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.controller.NumberConvertController;
import com.codetest.jbj.service.NumberConverterService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(NumberConvertController.class)
public class NumberConvertControllerMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NumberConverterService service;

    @Test
    public void convertToRomanShouldReturnMessageFromService() throws Exception {
        when(service.convertToRoman(100)).thenReturn("C");
        this.mockMvc.perform(get("/number-converter/toRoman/100"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("C")));
    }

    @Test
    public void convertToRomanShouldReturnMessageFromService_2() throws Exception {
        when(service.convertTo(100, FormatType.ROMAN)).thenReturn("C");
        when(service.convertToRoman(100)).thenReturn("C");
        this.mockMvc.perform(get("/number-converter/convert/100/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("C")));


    }
    @Test
    public void convertToBinaryShouldReturnMessageFromService_3() throws Exception {
        when(service.convertTo(100, FormatType.BINARY)).thenReturn("1100100");
        this.mockMvc.perform(get("/number-converter/convert/100/BINARY"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("1100100")));


    }
}
