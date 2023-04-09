package com.javamaster.spring_crud.controller;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mt")
@AllArgsConstructor
@Log
@CrossOrigin
public class mTConctroller {

    private final OrderService orderService;
    @RequestMapping("/getAllByUserId/{userId}")
    public List<OrderDto> findByAllByUserId(@PathVariable Integer userId){
        log.info("Handing find all by userId request" + userId );
        return orderService.findAllByUser(userId);
    }

    @PostMapping("/update")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) throws ValidationException {
        log.info("HandLing update aplication" + orderDto);
        return orderService.saveOrder(orderDto);
    }
}
