package com.codetest.jbj.controller;

import com.codetest.jbj.bean.ConverterResult;
import com.codetest.jbj.bean.FormatType;

import com.codetest.jbj.service.NumberConverterService;
import com.codetest.jbj.utils.ApplicationException;
import com.codetest.jbj.utils.Constants;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/number-converter")
public class NumberConvertController {

    private final Logger logger = LoggerFactory.getLogger(NumberConvertController.class);

    @Autowired
    NumberConverterService numberConverterService;

    @ApiOperation(value = "convert DECIMAL To ROMAN ", response = ConverterResult.class)
    @CrossOrigin(origins = Constants.FrontEnd_URL)
    @GetMapping("/toRoman/{num}")
    @ResponseBody
    public ResponseEntity<ConverterResult> convertToRoman(@PathVariable final int num) {

        if(num <= 0 || num > 1000) return new ResponseEntity<>( HttpStatus.BAD_REQUEST);

        try {
            String convertedString = numberConverterService.convertToRoman(num);

            ConverterResult convertResponse =
                    new ConverterResult(num, convertedString, FormatType.ROMAN);

            return new ResponseEntity<>(convertResponse, HttpStatus.OK);

        }catch (ApplicationException ex){
            logger.error(ex.getMessage());
        }
        return new ResponseEntity<>( HttpStatus.EXPECTATION_FAILED);
    }

    @ApiOperation(value = "convert DECIMAL To  ROMAN or BINARY or HEXADECIMAL", response = ConverterResult.class)

    @CrossOrigin(origins = Constants.FrontEnd_URL)
    @GetMapping("/convert/{num}/{type}")
    @ResponseBody
    public ResponseEntity<ConverterResult> convertTo(@PathVariable final int num,
                                                     @PathVariable final FormatType type) {
        if((num <= 0 || num > 1000) && type == FormatType.ROMAN )
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);

        try {
            String convertedString = numberConverterService.convertTo(num, type);

            ConverterResult convertResponse = new ConverterResult(num, convertedString, type);

            return new ResponseEntity<>(convertResponse, HttpStatus.OK);

        }catch (ApplicationException ex){
            logger.error(ex.getMessage());
        }
        return new ResponseEntity<>( HttpStatus.EXPECTATION_FAILED);
    }
}
