package com.luv2code.tms.controllers;

import java.util.List;

import com.luv2code.tms.daos.Dao;
import com.luv2code.tms.models.Category;
import com.luv2code.tms.services.CategoryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/categories")
public class CategoryController implements CategoryService {

    private Dao<Category> dao;

    public CategoryController(Dao<Category> dao) {
        this.dao = dao;
    }

    @GetMapping("/types/{type}")
    @Override
    public @ResponseBody List<Category> getAll(@PathVariable(value = "type") Integer type) {
        return null;
    }

    @GetMapping("/{id}")
    @Override
    public @ResponseBody Category getOne(@PathVariable(value = "id") Integer id) {
        return null;
    }

    @PostMapping("/")
    @Override
    public @ResponseBody Integer createOne(@RequestBody Category category) {
        return 0;
    }

    @PutMapping("/{id}")
    @Override
    public @ResponseBody Boolean updateOne(@PathVariable(value = "id") Integer id, @RequestBody Category category) {
        return false;
    }

    @DeleteMapping("/{id}")
    @Override
    public @ResponseBody Boolean deleteOne(@PathVariable(value = "id") Integer id) {
        return false;
    }
}