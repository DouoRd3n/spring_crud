package com.javamaster.spring_crud.converter;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.entity.Order;
import org.springframework.stereotype.Component;
@Component
public class OrderConverter {


    public Order fromOrderDtoToOrder(OrderDto orderDto){
        Order order = new Order();
         order.setId(order.getId());
         order.setOwner(orderDto.getOwner());
         order.setAddress(orderDto.getAddress());
         order.setLocalDate(orderDto.getLocalDate());
         order.setProblemType(orderDto.getProblemType());
         order.setOperator(orderDto.getOperator());
         order.setUserId(orderDto.getUserId());
         order.setElectric(orderDto.getElectric());

        return order;
    }

    public OrderDto fromOrderToOrderDTO(Order order){


        return OrderDto.builder()
                .id(order.getId())
                .owner(order.getOwner())
                .address(order.getAddress())
                .localDate(order.getLocalDate())
                .problemType(order.getProblemType())
                .operator(order.getOperator())
                .userId(order.getUserId())
                .electric(order.getElectric())
                .build();
    }
}
