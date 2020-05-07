package com.codetest.jbj.service;

import org.springframework.stereotype.Component;

@Component
public interface NumberConverter {
     public String convert( int num);
}
