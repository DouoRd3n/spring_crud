package com.javamaster.spring_crud.repository;

import com.javamaster.spring_crud.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findAplicationsByUserId(Integer userId);





}
