package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class Globalexception{

@ExceptionHandler(Validationexception.class)
public ResponseBode String






}