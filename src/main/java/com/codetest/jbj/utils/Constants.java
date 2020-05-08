package com.codetest.jbj.utils;

public class Constants {
    public static final String Invalid_Type = "Invalid Type";
    public static final String Invalid_Number_ROMAN = "Invalid Number for ROMAN";
    public static final String Invalid_Argument = "Invalid Argument";
    public static final String FrontEnd_URL = "http://localhost:3000";

    /*
    static private NumberConverter hindiConverter = (num) -> {
        StringBuffer toHindi = new StringBuffer();
        if (num < 0){
            toHindi.append("-");
            num *=-1;
        }
        char[] arr = (""+num).toCharArray();
        char[] hindiDigint = {'0','१','२','३','४','५','६','७','८','९'};
        for(int i =0; i < arr.length; i++ ){
            toHindi.append(hindiDigint[arr[i]]);
        }
        return toHindi.toString();
    };

   */

}
