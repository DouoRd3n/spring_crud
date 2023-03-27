package com.javamaster.spring_crud.repository;

import com.javamaster.spring_crud.entity.Aplications;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AplicationsRepository extends JpaRepository<Aplications, Integer> {

    List<Aplications> findAplicationsByUserId(Integer userId);





}
