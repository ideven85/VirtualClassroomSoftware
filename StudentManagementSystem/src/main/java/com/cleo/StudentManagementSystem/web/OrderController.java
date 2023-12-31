package com.cleo.StudentManagementSystem.web;

import com.cleo.StudentManagementSystem.domain.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/order")
    public ResponseEntity<Order> getOrder(){
        Order order = Order.builder().name("Order One").description("Order One Description").build();
        return ResponseEntity.ok(order);
    }
}
