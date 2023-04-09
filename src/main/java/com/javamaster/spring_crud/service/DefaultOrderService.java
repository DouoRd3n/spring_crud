package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.entity.Order;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.repository.OrderRepository;

import com.javamaster.spring_crud.converter.OrderConverter;
import lombok.AllArgsConstructor;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultOrderService implements OrderService {

    private final OrderRepository orderRepository;

    private final OrderConverter orderConverter;




    @Override
    public OrderDto saveOrder(OrderDto orderDto) throws ValidationException {
        validateOrderDto(orderDto);
        Order savedAplication = orderRepository.save(orderConverter.fromOrderDtoToOrder(orderDto));

        return orderConverter.fromOrderToOrderDTO(savedAplication);
    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderRepository.deleteById(orderId);
    }

    @Override
    public List<OrderDto> findAllByUser(Integer userId) {
        return orderRepository.findAplicationsByUserId(userId).stream()
                .map(orderConverter::fromOrderToOrderDTO)
                .collect(Collectors.toList());
    }

    private void validateOrderDto(OrderDto orderDto) throws ValidationException {
        if (isNull(orderDto)) {
            throw new ValidationException("Object aplication is null");
        }
        if (isNull(orderDto.getObjectAdress()) || orderDto.getObjectAdress().isEmpty()) {
            throw new ValidationException("address is empty");
        }
    }

    @Override
    public void updateOrder(OrderDto orderDto, Integer userid) {
           orderRepository.findById(userid);
    }

    @Override
    public List<OrderDto> findAll() {
        return orderRepository.findAll().stream()
                .map(orderConverter::fromOrderToOrderDTO)
                .collect(Collectors.toList());
    }
}
