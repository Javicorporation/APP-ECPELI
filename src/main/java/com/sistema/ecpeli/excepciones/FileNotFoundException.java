package com.sistema.ecpeli.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
// tiene un propósito especial en un entorno web (Spring Boot)
// devulve el codigo del estado de la operacion del servidor un 404
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class FileNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FileNotFoundException(String mensaje) {
        super(mensaje);
    }

    public FileNotFoundException(String mensage, Throwable excepcion) {
        super(mensage, excepcion);
    }
}
