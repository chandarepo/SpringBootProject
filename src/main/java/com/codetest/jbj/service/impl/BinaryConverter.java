package com.codetest.jbj.service.impl;

import com.codetest.jbj.service.NumberConverter;

public class BinaryConverter implements NumberConverter {

   /* @Override
    public String convert(int num) {
        if(num == 0 ) return "0";

        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        StringBuffer result = new StringBuffer();
        for(int i = index-1;i >= 0;i--){
            result.append(binary[i]);
        }

        return result.toString();
    } */

   public String convert(int num) {
       return Integer.toBinaryString(num);
   }

}
