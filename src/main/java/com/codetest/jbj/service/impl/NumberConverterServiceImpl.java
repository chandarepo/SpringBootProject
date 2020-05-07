package com.codetest.jbj.service.impl;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.service.NumberConverterService;
import com.codetest.jbj.service.NumberConverter;
import com.codetest.jbj.utils.Constants;
import com.codetest.jbj.utils.NumberConverterFactory;
import org.springframework.stereotype.Service;

@Service
public class NumberConverterServiceImpl implements NumberConverterService {

    @Override
    public String convertToRoman(int num) {
        return convertTo(num,FormatType.ROMAN );
    }

    @Override
    public String convertTo(int num, FormatType type) {
        if( type == null ) {
            throw new IllegalArgumentException(Constants.Invalid_Type);
        }
        if(num <= 0 && type == FormatType.ROMAN ) {
            throw new IllegalArgumentException(Constants.Invalid_Number_ROMAN);
        }

        NumberConverter converter = NumberConverterFactory.getNumberFormater(type);

        return converter.convert(num);
    }

    @Override
    public String convertTo (int num, NumberConverter converter){
        if(converter == null ) throw new IllegalArgumentException(Constants.Invalid_Argument);
        return converter.convert(num);
    }
}
