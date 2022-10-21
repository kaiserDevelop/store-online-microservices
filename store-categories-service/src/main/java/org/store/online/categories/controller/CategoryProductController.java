package org.store.online.categories.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.store.online.categories.model.CategoryProductEntity;
import org.store.online.categories.repository.CategoryProductRepository;
import java.util.List;

@RestController
@RequestMapping("/api/categoryProducts")
public class CategoryProductController {

    @Autowired
    private CategoryProductRepository categoryProductRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryProductEntity> categories() {
        return categoryProductRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createCategoryProducts(@RequestBody CategoryProductEntity categoryProductEntity) {
        categoryProductRepository.save(categoryProductEntity);
    }


}
