package com.codetest.jbj.bean;

public class ConverterResult {

    private int num;
    private String convertedValue;
    private FormatType convertType;

    public ConverterResult(){
    }

    public ConverterResult(int num, String convertedValue,FormatType convertType){
        this.num= num;
        this.convertedValue= convertedValue;
        this.convertType = convertType;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(String convertedValue) {
        this.convertedValue = convertedValue;
    }

    public FormatType getConvertType() {
        return convertType;
    }

    public void setConvertType(FormatType convertType) {
        this.convertType = convertType;
    }
}
