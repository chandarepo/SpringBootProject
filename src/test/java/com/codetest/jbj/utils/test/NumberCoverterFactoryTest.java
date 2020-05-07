package com.codetest.jbj.utils.test;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.service.NumberConverter;
import com.codetest.jbj.service.impl.BinaryConverter;
import com.codetest.jbj.service.impl.RomanConverter;
import com.codetest.jbj.utils.NumberConverterFactory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberCoverterFactoryTest {

    @Test
    void getNumberFormater_Type_Roman() {
        NumberConverter numberConverter =
                NumberConverterFactory.getNumberFormater(FormatType.ROMAN);
        assertNotNull(numberConverter);
        assertTrue(numberConverter instanceof NumberConverter);
        assertTrue(numberConverter instanceof RomanConverter);
    }

    @Test
    void getNumberFormater_Type_Binary() {
        NumberConverter numberConverter =
                NumberConverterFactory.getNumberFormater(FormatType.BINARY);
        assertNotNull(numberConverter);
        assertTrue(numberConverter instanceof BinaryConverter);
        //assertTrue(numberConverter instanceof NumberConverter);
    }
}
