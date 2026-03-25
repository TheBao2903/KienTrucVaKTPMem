package com.example.orders.controller;

import com.example.orders.model.Order;
import com.example.orders.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    private final OrderRepository repo;
    public OrdersController(OrderRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Order> all() { return repo.findAll(); }

    @PostMapping
    public Order create(@RequestBody Order o) { o.setStatus("PLACED"); return repo.save(o); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) { repo.deleteById(id); }
}
