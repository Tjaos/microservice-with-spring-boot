package br.com.thiagoamaral.catalog_service.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class ProductException extends RuntimeException {

    public static final String MSG_PRICE_INVALID = "Preço não pode ser nulo ou menor ou igual a zero";

    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }

}
