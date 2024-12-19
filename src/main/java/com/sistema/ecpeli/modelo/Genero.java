package com.sistema.ecpeli.modelo;

import jakarta.persistence.*;

@Entity
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGenero")
    private Integer idGenero;
    private String titulo;

    public Genero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Genero(Integer idGenero, String titulo) {
        super();
        this.idGenero = idGenero;
        this.titulo = titulo;
    }

    public Genero() {
        super();
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Genero {" +
                "idGenero=" + idGenero +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
