package com.websupercar.supercar.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.websupercar.supercar.service.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> rnf(ResourceNotFoundException e, HttpServletRequest request){
        String typeError = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        String message = e.getMessage();
        StandardError error = new StandardError(Instant.now(), status.value(), typeError, message, request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }
}
