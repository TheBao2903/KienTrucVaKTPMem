package com.example.menu.repository;

import com.example.menu.model.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<MenuItem, String> {
}
