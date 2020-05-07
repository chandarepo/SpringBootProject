package com.codetest.jbj.service;

import com.codetest.jbj.bean.FormatType;
import org.springframework.stereotype.Service;

@Service
public interface NumberConverterService {

    public String convertToRoman (int num);

    public String convertTo (int num, FormatType type);

    public String convertTo (int num, NumberConverter converter);
}
