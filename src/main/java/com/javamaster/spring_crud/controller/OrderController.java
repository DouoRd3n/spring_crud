package com.javamaster.spring_crud.controller;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
@Log
@CrossOrigin
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/save")
    public OrderDto saveOrder(@RequestBody OrderDto orderDto) throws ValidationException{
        log.info("HandLing save aplication" + orderDto);
        return orderService.saveOrder(orderDto);
    }


    @GetMapping("/findAllByUserId/{userId}")
    public List<OrderDto> findAllByUserId(@PathVariable Integer userId){
        log.info("Handing find all by userId request" + userId );
        return orderService.findAllByUser(userId);
    }

    @GetMapping("/findAll")
    public List<OrderDto> findAll(){
        log.info("Handling find all aplications request");
        return orderService.findAll();
    }

    @DeleteMapping("/delete/{OrderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer OrderId){
        log.info("Handling delete aplication request: " + OrderId);
        orderService.deleteOrder(OrderId);
        return ResponseEntity.ok().build();
    }
}
