package net.usermd.czarnowr.cryptography.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {EmptyStringException.class})
    protected ResponseEntity<Object> handleEmptyString(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "{ error : Cannot process an empty String, please provide input }";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY, request);
    }

    @ExceptionHandler(value = {NoLettersException.class})
    protected ResponseEntity<Object> handleNoLetterCharacters(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "{ error : Input does not contain letters }";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY, request);
    }
}
