package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

}
