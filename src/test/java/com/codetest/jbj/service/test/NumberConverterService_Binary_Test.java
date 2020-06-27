package com.codetest.jbj.service.test;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.service.NumberConverter;
import com.codetest.jbj.service.NumberConverterService;
import com.codetest.jbj.utils.NumberConverterFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class NumberConverterService_Binary_Test {

    public NumberConverterService_Binary_Test(){}

    @Autowired
    NumberConverterService converterService;

    static NumberConverter binaryConverter = null;

    @BeforeAll
    public static void init() {
        binaryConverter =
                NumberConverterFactory.getNumberFormater(FormatType.BINARY);
    }
    @Test
    public void testInstance(){
        assertNotNull(converterService);
        assertNotNull(binaryConverter);
    }

    @Test
    void testConvertTo_Binary_with_Converter() {
        boolean onError = false;
        try{
            String binaryOfTen = "1010";
            String actual_binaryOfTen =
                    converterService.convertTo(10, FormatType.BINARY);
            assertEquals(binaryOfTen, actual_binaryOfTen);

            String _actual_binaryOfTen =
                    converterService.convertTo(10, binaryConverter);
            assertEquals(_actual_binaryOfTen, actual_binaryOfTen);

            String binaryOfZero = "0";
            String actual_binaryOfZero =
                    converterService.convertTo(0, binaryConverter);
            assertEquals(binaryOfZero, actual_binaryOfZero);
        }catch (Exception ex){
            assertTrue(onError);
        }
    }


}
