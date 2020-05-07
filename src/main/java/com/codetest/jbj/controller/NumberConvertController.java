package com.codetest.jbj.controller;

import com.codetest.jbj.bean.ConverterResult;
import com.codetest.jbj.bean.FormatType;

import com.codetest.jbj.service.NumberConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/number-converter")
public class NumberConvertController {

    @Autowired
    NumberConverterService numberConverterService;

    @GetMapping("/toRoman/{num}")
    @ResponseBody
    public ResponseEntity<ConverterResult> convertToRoman(@PathVariable final int num) {

        if(num <= 0) return new ResponseEntity<>( HttpStatus.BAD_REQUEST);

        try {
            String convertedString = numberConverterService.convertToRoman(num);

            ConverterResult convertResponse =
                    new ConverterResult(num, convertedString, FormatType.ROMAN);

            return new ResponseEntity<>(convertResponse, HttpStatus.OK);

        }catch (Exception ex){
            //log_exception
            ex.printStackTrace();
        }
        return new ResponseEntity<>( HttpStatus.EXPECTATION_FAILED);
    }

    @GetMapping("/convert/{num}/{type}")
    @ResponseBody
    public ResponseEntity<ConverterResult> convertTo(@PathVariable final int num,
                                                     @PathVariable final FormatType type) {
        if(num <= 0 && type == FormatType.ROMAN)
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);

        try {
            String convertedString = numberConverterService.convertTo(num, type);

            ConverterResult convertResponse = new ConverterResult(num, convertedString, type);

            return new ResponseEntity<>(convertResponse, HttpStatus.OK);

        }catch (Exception ex){
            //log_exception
            ex.printStackTrace();
        }
        return new ResponseEntity<>( HttpStatus.EXPECTATION_FAILED);
    }
}
