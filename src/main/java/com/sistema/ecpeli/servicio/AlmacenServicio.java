package com.sistema.ecpeli.servicio;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

public interface AlmacenServicio {

    // metodos que se implementaran en el dao

    public void iniciarAlmacenamiento();

    public String almacenarArchivo(MultipartFile archivo);

    public Path cargarArchivos(String nombreDeArchivo);

    public Resource cargarComoRecurso(String nombreArchivo);

    public void eliminarArchivo(String nombreArchivo);
}
