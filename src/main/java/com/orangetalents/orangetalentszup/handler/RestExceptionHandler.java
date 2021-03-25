package com.orangetalents.orangetalentszup.handler;

import com.orangetalents.orangetalentszup.exception.ExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDetails> handlerMethodExceptionDetails(MethodArgumentNotValidException mav){
                return new ResponseEntity<>(new ExceptionDetails("Bad Request Exception, Check the Documentation",
                        HttpStatus.BAD_REQUEST.value(),
                        mav.getBindingResult().getAllErrors().get(0).getDefaultMessage(),
                        mav.getClass().getName(),
                        LocalDateTime.now()),HttpStatus.BAD_REQUEST);
    }
}
