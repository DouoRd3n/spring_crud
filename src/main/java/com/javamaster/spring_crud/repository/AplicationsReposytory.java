package com.javamaster.spring_crud.repository;

import com.javamaster.spring_crud.entity.Aplications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AplicationsReposytory extends JpaRepository<Aplications, Integer> {

    List<Aplications> findAplicationsByElectric (String electric) ;

}
