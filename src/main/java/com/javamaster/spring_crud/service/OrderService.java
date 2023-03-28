package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.exception.ValidationException;

import java.util.List;

public interface OrderService {

    OrderDto saveOrder(OrderDto orderDto) throws ValidationException;

    void deleteOrder(Integer orderId);

//    Aplications getAplication(Integer aplicationId);

    List<OrderDto> findAllByUser(Integer userId);

    void updateOrder(OrderDto orderDto, Integer userid);

    List<OrderDto> findAll();

}
