package com.codetest.jbj.utils;

public class AppException extends Exception {
    String errorMsg;
    Throwable th;
    public AppException(){
        super();
    }
    public AppException(String errorMsg){
        super(errorMsg);
        this.errorMsg=errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Throwable getTh() {
        return th;
    }

    public void setTh(Throwable th) {
        this.th = th;
    }
}
