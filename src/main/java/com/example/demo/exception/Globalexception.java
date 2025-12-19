package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestControllerAdvice
public class Globalexception{

@ExceptionHandler(Validationexception.class)
public ResponseBody<String> handleValidationexception(Validationexception ex){
return new ResponseBody

}






}