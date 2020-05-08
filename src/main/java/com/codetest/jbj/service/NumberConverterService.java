package com.codetest.jbj.service;

import com.codetest.jbj.bean.FormatType;
import com.codetest.jbj.utils.ApplicationException;
import org.springframework.stereotype.Service;

@Service
public interface NumberConverterService {

    public String convertToRoman (int num) throws ApplicationException;

    public String convertTo (int num, FormatType type) throws ApplicationException;

    public String convertTo (int num, NumberConverter converter) throws ApplicationException;
}
