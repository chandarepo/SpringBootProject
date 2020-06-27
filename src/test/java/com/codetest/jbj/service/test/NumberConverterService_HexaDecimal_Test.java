package com.codetest.jbj.service.test;

import com.codetest.jbj.service.NumberConverter;
import com.codetest.jbj.service.NumberConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class NumberConverterService_HexaDecimal_Test {
    public NumberConverterService_HexaDecimal_Test(){}
    @Autowired
    NumberConverterService converterService;

    NumberConverter hexaDecimalConverter = (num) -> { return Integer.toHexString(num); };

    @Test
    public void testInstance(){
        assertNotNull(converterService);
    }

    @Test
    void testConvertTo_Hex() {
        try {
            String toHexString =
                    converterService.convertTo(234, hexaDecimalConverter);
            assertNotNull(toHexString);
            assertEquals(toHexString, "ea");
        }catch (Exception ex){

        }
    }
}
