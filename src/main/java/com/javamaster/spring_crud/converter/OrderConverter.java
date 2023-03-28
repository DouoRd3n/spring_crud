package com.javamaster.spring_crud.converter;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.entity.Order;
import org.springframework.stereotype.Component;
@Component
public class OrderConverter {


    public Order fromOrderDtoToOrder(OrderDto orderDto){
        Order aplication = new Order();
         aplication.setId(aplication.getId());
         aplication.setOwner(orderDto.getOwner());
         aplication.setAddress(orderDto.getAddress());
         aplication.setLocalDate(orderDto.getLocalDate());
         aplication.setProblemType(aplication.getProblemType());
         aplication.setOperator(aplication.getOperator());
         aplication.setUserId(orderDto.getUserId());
         aplication.setElectric(orderDto.getElectric());

        return aplication;
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
