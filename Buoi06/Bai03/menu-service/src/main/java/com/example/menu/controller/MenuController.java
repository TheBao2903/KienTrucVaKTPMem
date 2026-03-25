package com.example.menu.controller;

import com.example.menu.model.MenuItem;
import com.example.menu.repository.MenuRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private final MenuRepository repo;
    public MenuController(MenuRepository repo) { this.repo = repo; }

    @GetMapping
    public List<MenuItem> all() { return repo.findAll(); }

    @PostMapping
    public MenuItem create(@RequestBody MenuItem i) { return repo.save(i); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) { repo.deleteById(id); }
}
