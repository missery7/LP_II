package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
