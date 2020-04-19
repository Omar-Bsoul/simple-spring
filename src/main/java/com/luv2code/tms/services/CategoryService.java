package com.luv2code.tms.services;

import java.util.List;

import com.luv2code.tms.models.Category;

public interface CategoryService {

    List<Category> getAll(Integer type);

    Category getOne(Integer id);

    Integer createOne(Category category);

    Boolean updateOne(Integer id, Category category);

    Boolean deleteOne(Integer id);
}
