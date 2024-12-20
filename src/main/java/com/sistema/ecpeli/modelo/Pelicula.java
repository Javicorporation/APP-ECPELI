package com.sistema.ecpeli.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pelicula {
    @Id
    // Indica que el valor de este campo será generado automáticamente
    // por la base de datos usando la estrategia de identidad.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Define que el nombre de la columna en la base de datos será
    @Column(name = "idPelicula")
    private Integer id;

    // Valida que el campo no sea nulo ni vacío (aplica a Strings).
    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @NotBlank
    private String sinopsis;

    // Valida que el campo no sea nulo
    @NotNull
    // Indica que el campo debe ser formateado
    // como una fecha en el formato ISO (por ejemplo, YYYY-MM-DD)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaEstreno;

    @NotBlank
    private String link;

    @NotBlank
    private String urlImg;

    @NotEmpty
    // Define una relación de muchos a muchos entre películas y géneros.
    @ManyToMany(fetch = FetchType.LAZY)
    // Define la tabla de unión que conecta Pelicula con Genero
    @JoinTable(name = "generoPelicula",
            joinColumns = @JoinColumn(name = "idPelicula"),
            inverseJoinColumns = @JoinColumn(name = "IdGenero"))
    private List<Genero> generos;

    //  Indica que este campo no será persistido en la base de datos.
    @Transient
    // Es utilizado para manejar archivos subidos (como la portada de la película).
    private MultipartFile portada;
}
