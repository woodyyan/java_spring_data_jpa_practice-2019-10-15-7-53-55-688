package com.tw.apistackbase.controller;

import com.tw.apistackbase.error.CustomError;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<CustomError> handleNotFoundException() {
        CustomError customError = new CustomError();
        customError.setCode(404);
        customError.setMessage("Cannot find company id.");
        return new ResponseEntity<>(customError, HttpStatus.NOT_FOUND);
    }
}
