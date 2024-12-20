package com.sistema.ecpeli.repositorios;

import com.sistema.ecpeli.modelo.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepositorio  extends JpaRepository<Genero, Integer> {
}
