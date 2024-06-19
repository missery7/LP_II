package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entity.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer>{

}
