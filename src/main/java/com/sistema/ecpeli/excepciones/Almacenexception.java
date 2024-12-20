package com.sistema.ecpeli.excepciones;

// esta exception es general, y sirve para manejar errores de operaciones con leer, guardar, etc

// extebder hace que esta clse sea una exception no verificada
public class Almacenexception extends RuntimeException {

    // definimos el serial
    private static final long serialVersionUID = 1L;

    public Almacenexception(String mensaje) {
        super(mensaje);
    }

    public Almacenexception(String mensaje, Throwable exception) {
        super(mensaje, exception);
    }
}
