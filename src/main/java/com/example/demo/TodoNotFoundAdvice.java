package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class TodoNotFoundAdvice {

  @ExceptionHandler(TodoNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String todoNotFoundHandler(TodoNotFoundException ex) {
    return ex.getMessage();
  }
}