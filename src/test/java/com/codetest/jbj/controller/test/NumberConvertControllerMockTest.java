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

import org.mockito.exceptions.base.MockitoException;
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

    /**
     *     private final int[] divisors =
     *             {1, 2, 3, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
     *     private final String[] symbols =
     *             {"I","II","III", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
     * @throws Exception
     */
    @Test
    public void convertToRomanShouldReturnMessageFromService_1() throws Exception {
        when(service.convertTo(1, FormatType.ROMAN)).thenReturn("I");
        when(service.convertToRoman(1)).thenReturn("I");
        this.mockMvc.perform(get("/number-converter/convert/1/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("I")));
    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_2() throws Exception {
        when(service.convertTo(2, FormatType.ROMAN)).thenReturn("II");
        when(service.convertToRoman(2)).thenReturn("II");
        this.mockMvc.perform(get("/number-converter/convert/2/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("II")));
    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_3() throws Exception {
        when(service.convertTo(3, FormatType.ROMAN)).thenReturn("III");
        when(service.convertToRoman(3)).thenReturn("III");
        this.mockMvc.perform(get("/number-converter/convert/3/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("III")));
    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_4() throws Exception {
        when(service.convertTo(4, FormatType.ROMAN)).thenReturn("IV");
        when(service.convertToRoman(4)).thenReturn("IV");
        this.mockMvc.perform(get("/number-converter/convert/4/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("IV")));
    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_5() throws Exception {
        when(service.convertTo(5, FormatType.ROMAN)).thenReturn("V");
        when(service.convertToRoman(5)).thenReturn("V");
        this.mockMvc.perform(get("/number-converter/convert/5/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("V")));
    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_6() throws Exception {
        when(service.convertTo(6, FormatType.ROMAN)).thenReturn("VI");
        when(service.convertToRoman(6)).thenReturn("VI");
        this.mockMvc.perform(get("/number-converter/convert/6/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("VI")));
    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_7() throws Exception {
        when(service.convertTo(7, FormatType.ROMAN)).thenReturn("VII");
        when(service.convertToRoman(7)).thenReturn("VII");
        this.mockMvc.perform(get("/number-converter/convert/7/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("VII")));

    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_8() throws Exception {
        when(service.convertTo(8, FormatType.ROMAN)).thenReturn("VIII");
        when(service.convertToRoman(8)).thenReturn("VIII");
        this.mockMvc.perform(get("/number-converter/convert/8/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("VIII")));

    }

    @Test
    public void convertToRomanShouldReturnMessageFromService_9() throws Exception {
        when(service.convertTo(9, FormatType.ROMAN)).thenReturn("IX");
        when(service.convertToRoman(9)).thenReturn("IX");
        this.mockMvc.perform(get("/number-converter/convert/9/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("IX")));


    }

    @Test
    public void convertToRomanShouldReturnMessageFromService_10() throws Exception {
        when(service.convertTo(10, FormatType.ROMAN)).thenReturn("X");
        when(service.convertToRoman(10)).thenReturn("X");
        this.mockMvc.perform(get("/number-converter/convert/10/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("X")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_40() throws Exception {
        when(service.convertTo(40, FormatType.ROMAN)).thenReturn("XL");
        when(service.convertToRoman(40)).thenReturn("XL");
        this.mockMvc.perform(get("/number-converter/convert/40/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("XL")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_50() throws Exception {
        when(service.convertTo(50, FormatType.ROMAN)).thenReturn("L");
        when(service.convertToRoman(50)).thenReturn("L");
        this.mockMvc.perform(get("/number-converter/convert/50/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("L")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_90() throws Exception {
        when(service.convertTo(90, FormatType.ROMAN)).thenReturn("XC");
        when(service.convertToRoman(90)).thenReturn("XC");
        this.mockMvc.perform(get("/number-converter/convert/90/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("XC")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_145() throws Exception {
        when(service.convertTo(145, FormatType.ROMAN)).thenReturn("CXXV");
        when(service.convertToRoman(145)).thenReturn("CXXV");
        this.mockMvc.perform(get("/number-converter/convert/145/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("CXXV")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_400() throws Exception {
        when(service.convertTo(400, FormatType.ROMAN)).thenReturn("CD");
        when(service.convertToRoman(400)).thenReturn("CD");
        this.mockMvc.perform(get("/number-converter/convert/400/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("CD")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_500() throws Exception {
        when(service.convertTo(500, FormatType.ROMAN)).thenReturn("D");
        when(service.convertToRoman(500)).thenReturn("D");
        this.mockMvc.perform(get("/number-converter/convert/500/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("D")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_900() throws Exception {
        when(service.convertTo(900, FormatType.ROMAN)).thenReturn("CM");
        when(service.convertToRoman(900)).thenReturn("CM");
        this.mockMvc.perform(get("/number-converter/convert/900/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("CM")));


    }
    @Test
    public void convertToRomanShouldReturnMessageFromService_1000() throws Exception {
        when(service.convertTo(1000, FormatType.ROMAN)).thenReturn("M");
        when(service.convertToRoman(1000)).thenReturn("M");
        this.mockMvc.perform(get("/number-converter/convert/1000/ROMAN"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("M")));


    }

    @Test
    public void convertToRomanShouldReturnMessageFromService_100() throws Exception {
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

    @Test
    public void convertToRomanShouldReturnHTTPStatus400_BAD_REQUEST_0() throws Exception {
        when(service.convertTo(0, FormatType.ROMAN)).thenThrow(new MockitoException(""));
        this.mockMvc.perform(get("/number-converter/convert/0/ROMAN"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
    @Test
    public void convertToRomanShouldReturnHTTPStatus400_BAD_REQUEST_1001() throws Exception {
        when(service.convertTo(1001, FormatType.ROMAN)).thenThrow(new MockitoException(""));
        this.mockMvc.perform(get("/number-converter/convert/1001/ROMAN"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
    @Test
    public void convertToRomanShouldReturnHTTPStatus400_BAD_REQUEST_NegativeNumbers() throws Exception {
        when(service.convertTo(-100, FormatType.ROMAN)).thenThrow(new MockitoException(""));
        this.mockMvc.perform(get("/number-converter/convert/-100/ROMAN"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }
}
