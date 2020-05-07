package com.codetest.jbj.service.test;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.service.NumberConverter;
import com.codetest.jbj.service.NumberConverterService;
import com.codetest.jbj.utils.NumberConverterFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
public class NumberConverterService_Roman_Test {

    @Autowired
    NumberConverterService numberConverterService;

    static NumberConverter numberConverter = null;

    private final int[] divisors =
            {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private final String[] symbols =
            {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    /**
     *  Boundary Conditions: [499 & 501,  99 & 101]
     *
     *  Combinations [101, 110, 190, 150, 140 ]
     */

    private final int[] testDataCombinations =
            {521, 657,99,499, 501, 899, 901, 999, 101, 110, 190, 150, 140};

    private final String[] expectedResult =
            {"DXXI", "DCLVII","XCIX","CDXCIX","DI","DCCCXCIX","CMI","CMXCIX","CI","CX","CXC","CL","CXL"};


    @BeforeAll
    public static void init() {
        numberConverter =
                NumberConverterFactory.getNumberFormater(FormatType.ROMAN);
    }
    @Test
    public void testInstance(){
        assertNotNull(numberConverterService);
        assertNotNull(numberConverter);
    }

    @Test
    void testConvertTo_Roman_Divisors_Ok() {
        for(int i =0; i < divisors.length; i++){
            assertEquals(numberConverterService.convertToRoman(divisors[i]), symbols[i]);
        }
    }

    @Test
    void testConvertTo_Divisors_Ok() {
        for(int i =0; i < divisors.length; i++){
            String actual =
                    numberConverterService.convertTo(divisors[i], FormatType.ROMAN);
            assertEquals(actual, symbols[i]);
        }
    }

    @Test
    void testConvertToRoman_With_NumberConverter_Ok() {
        for(int i =0; i < divisors.length; i++){
            String actual =
                    numberConverterService.convertTo(divisors[i], numberConverter);
            assertEquals(actual, symbols[i]);
        }
    }

    @Test
    void testConvertTo_BoundaryConditionAndCombinations_Ok() {
        for(int i =0; i < divisors.length; i++){
            String actual =
                    numberConverterService.convertTo(testDataCombinations[i], FormatType.ROMAN);
            assertEquals(actual, expectedResult[i]);
        }
    }

    @Test
    void testConvertToRoman_BoundaryConditionAndCombinations_Ok() {
        for(int i =0; i < divisors.length; i++){
            String actual =
                    numberConverterService.convertToRoman(testDataCombinations[i]);
            assertEquals(actual, expectedResult[i]);
        }
    }

    @Test
    void testConvertToRoman_Zero() {
        boolean onError = true;
        try{
            numberConverterService.convertToRoman(0);
        }catch (IllegalArgumentException ex){
            assertTrue(onError);
        }
    }

    @Test
    void testConvertTo_Zero() {
        boolean onError = true;
        try{
            numberConverterService.convertTo(0, FormatType.ROMAN);
        }catch (IllegalArgumentException ex){
            assertTrue(onError);
        }
    }

    @Test
    void testConvertToRoman_NegativeNumbers() {
        boolean onError = true;
        for(int i =-10; i < 0; i++){
            try{
                numberConverterService.convertToRoman(i);
            }catch (IllegalArgumentException ex){
                assertTrue(onError);
            }
        }
    }
    @Test
    void testConvertTo_NegativeNumbers() {
        boolean onError = true;
        for(int i =-10; i < 0; i++){
            try{
                numberConverterService.convertTo(i, FormatType.ROMAN);
            }catch (IllegalArgumentException ex){
                assertTrue(onError);
            }
        }
    }

    @Test
    void testConvertTo_Random() {
        Random random = new Random();
        for(int i =0; i < 10; i++){
            int testNum  = random.nextInt();
            if(testNum >=1)
                assertNotNull(numberConverterService.convertTo( testNum, FormatType.ROMAN));
        }
    }
    @Test
    void testConvertToRoman_Random() {
        Random random = new Random();
        for(int i =0; i < 10; i++){
            int testNum  = random.nextInt();
            if(testNum >=1)
                assertNotNull(numberConverterService.convertToRoman( testNum));
        }
    }
}
