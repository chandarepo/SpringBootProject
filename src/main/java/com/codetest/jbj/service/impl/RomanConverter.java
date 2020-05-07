package com.codetest.jbj.service.impl;

import com.codetest.jbj.service.NumberConverter;
import com.codetest.jbj.utils.Constants;

/**
 * Algorithm to convert decimal number to Roman Numeral:
 *
 *  Compare given number with base values in the order
 *  1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1.
 *
 *  Base value which is just smaller or equal to the given number
 *  will be the initial base value (largest base value).
 *
 *  Divide the number by its largest base value, the
 *  corresponding base symbol will be repeated quotient times,
 *  the remainder will then become the number for future division and repetitions.
 *
 *  The process will be repeated until the number becomes zero.
 */
public class RomanConverter implements NumberConverter {

    private final static int[] divisors =
            {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    private final static String[]  symbols =
            {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public String convert(int num) {

        if(num <= 0) throw new IllegalArgumentException(Constants.Invalid_Number_ROMAN);

        int i = 12;

        StringBuffer formatedString = new StringBuffer();

        while( num > 0 ){
            int div = num / divisors[i];
            num = num % divisors[i];
            while(0 < div--){
                formatedString.append(symbols[i]);
            }
            i--;
        }
        return formatedString.toString();
    }
}
