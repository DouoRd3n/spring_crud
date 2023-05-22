package com.javamaster.spring_crud.controller;

import com.javamaster.spring_crud.dto.OrderDto;
import com.javamaster.spring_crud.entity.Order;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        return findPaginated(1,  model);
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model) {
        int pageSize = 5;

        Page<OrderDto> page = orderService.findPaginated(pageNo, pageSize, "applicationDate", "asc");
        List<OrderDto> listOrder = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());


        model.addAttribute("listOrder", listOrder);

        return "index";
    }

    @GetMapping("/showNewOrderForm")
    public String showNewOrderForm(Model model) {
        // create model attribute to bind form data
        OrderDto orderDto = new OrderDto();
        model.addAttribute("order", orderDto);
        return "new_order";
    }
    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") OrderDto orderDto) throws ValidationException {

        orderService.saveOrder(orderDto);
        return "redirect:/";
    }
    @GetMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable (value = "id") int id) {

        // call delete order method
        this.orderService.deleteOrder(id);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {

        // get employee from the service
        OrderDto orderDto = orderService.findOrder(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("order", orderDto);
        return "update_order";
    }
}
