package com.dh.meli.perolas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class Handler {
    @ExceptionHandler(LojaNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerJewelNotFound(LojaNotFoundException ex) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .title(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDetails> handlerJewelBadRequest(BadRequestException ex) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                    .title(ex.getMessage())
                    .timestamp(LocalDateTime.now())
                    .build(),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(InternalServerError.class)
    public ResponseEntity<ExceptionDetails> handlerInternalServerError(InternalServerError ex) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .title(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(),
                    HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
