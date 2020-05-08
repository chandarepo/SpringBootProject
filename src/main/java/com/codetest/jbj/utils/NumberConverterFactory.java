package com.codetest.jbj.utils;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.service.NumberConverter;

import com.codetest.jbj.service.impl.BinaryConverter;
import com.codetest.jbj.service.impl.HindiConverter;
import com.codetest.jbj.service.impl.RomanConverter;


public class NumberConverterFactory {

     public static NumberConverter getNumberFormater(FormatType type){
         if(type == null)
             throw new IllegalArgumentException(Constants.Invalid_Type);
         NumberConverter numberConverter;
         switch (type) {
             case ROMAN:
                 numberConverter =  new RomanConverter();
                 break;
             case BINARY:
                 numberConverter =  new BinaryConverter();
                 break;
             case HEXADECIMAL:
                 numberConverter =   (num) -> { return Integer.toHexString(num); };
                 break;
             case HINDI:
                 numberConverter = new HindiConverter();
                 break;
             default:
                 numberConverter = new RomanConverter();
                 break;
         }
         return numberConverter;
     }


}
