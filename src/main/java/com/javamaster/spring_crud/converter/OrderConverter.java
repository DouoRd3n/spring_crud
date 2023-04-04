package com.javamaster.spring_crud.converter;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.entity.Order;
import org.springframework.stereotype.Component;
@Component
public class OrderConverter {


    public Order fromOrderDtoToOrder(OrderDto orderDto){
        Order order = new Order();
         order.setId(orderDto.getId());
         order.setPlumes(orderDto.getPlumes());
         order.setReferral(orderDto.getReferral());
         order.setObjectAdress(orderDto.getObjectAdress());
         order.setApplicationDate(orderDto.getApplicationDate());
         order.setTheReasonForTheApplication(orderDto.getTheReasonForTheApplication());
         order.setWhoCreatedTheApplication(orderDto.getWhoCreatedTheApplication());
         order.setElectricianThatAcceptedTheApplication(orderDto.getElectricianThatAcceptedTheApplication());
         order.setApplicationResult(orderDto.getApplicationResult());
         order.setNote(orderDto.getNote());
         order.setUserId(orderDto.getUserId());

        return order;
    }

    public OrderDto fromOrderToOrderDTO(Order order){


        return OrderDto.builder()
                .id(order.getId())
                .plumes(order.getPlumes())
                .referral(order.getReferral())
                .objectName(order.getObjectName())
                .objectAdress(order.getObjectAdress())
                .applicationDate(order.getApplicationDate())
                .theReasonForTheApplication(order.getTheReasonForTheApplication())
                .whoCreatedTheApplication(order.getWhoCreatedTheApplication())
                .electricianThatAcceptedTheApplication(order.getElectricianThatAcceptedTheApplication())
                .applicationResult(order.getApplicationResult())
                .note(order.getNote())
                .userId(order.getUserId())
                .build();
    }
}
