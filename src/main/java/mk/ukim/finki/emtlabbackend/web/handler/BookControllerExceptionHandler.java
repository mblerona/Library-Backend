package mk.ukim.finki.emtlabbackend.web.handler;

import mk.ukim.finki.emtlabbackend.model.exception.AuthorNotFoundException;
import mk.ukim.finki.emtlabbackend.model.exception.BookNotAvailableException;
import mk.ukim.finki.emtlabbackend.web.controller.BookController;
import mk.ukim.finki.emtlabbackend.web.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = BookController.class)
public class BookControllerExceptionHandler {
    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<ApiError> handleNotFound(AuthorNotFoundException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ApiError.of(HttpStatus.NOT_FOUND, exception.getMessage()));
    }
    @ExceptionHandler(BookNotAvailableException.class)
    public ResponseEntity<ApiError> handleBookNotAvailable(BookNotAvailableException exception) {
        return ResponseEntity
                .badRequest()
                .body(ApiError.of(HttpStatus.BAD_REQUEST, exception.getMessage()));
    }
}
