package com.codetest.jbj.service.impl;

import com.codetest.jbj.service.NumberConverter;

public class HindiConverter implements NumberConverter {
    static char[] hindiDigits = {'0','१','२','३','४','५','६','७','८','९'};
    public String convert(int num) {
        StringBuffer toHindi = new StringBuffer();
        if (num < 0){
            toHindi.append("-");
            num *=-1;
        }
        String[] arr = (""+num).split("");
        for(int i =0; i < arr.length; i++ ){
            int idx = Integer.valueOf(arr[i]);
            toHindi.append(hindiDigits[idx]);
        }
        return toHindi.toString();
    }
}
