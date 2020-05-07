package com.codetest.jbj.service.test;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.service.NumberConverter;

import com.codetest.jbj.utils.NumberConverterFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RomanConverterTest {

    private final int[] divisors =
            {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private final String[] symbols =
            {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    static NumberConverter numberConverter = null;

    @BeforeAll
    public static void init(){
        numberConverter =
                NumberConverterFactory.getNumberFormater(FormatType.ROMAN);
    }
    @Test
    void convertToRoman_Divisors_Ok() {
        assertNotNull(numberConverter);
        for(int i =0; i < divisors.length; i++){
            assertEquals(numberConverter.convert(divisors[i]), symbols[i]);
        }
    }
    @Test
    void convertToRoman_Random() {
        Random random = new Random();
        for(int i =0; i < 10; i++){
            int testNum  = random.nextInt();
            if(testNum >=1)
                assertNotNull(numberConverter.convert( testNum));
        }
    }

    @Test
    void convertToRoman_NegativeNumbers() {
        boolean onError = true;
        for(int i =-10; i < 0; i++){
            try{
                numberConverter.convert(i);
            }catch (IllegalArgumentException ex){
                assertTrue(onError);
            }
        }
    }
    @Test
    void convertToRoman_Zero() {
        boolean onError = true;
        try{
            numberConverter.convert(0);
        }catch (IllegalArgumentException ex){
            assertTrue(onError);
        }
    }
}
