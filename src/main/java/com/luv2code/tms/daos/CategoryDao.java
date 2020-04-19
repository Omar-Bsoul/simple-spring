package com.luv2code.tms.daos;

import java.util.ArrayList;
import java.util.List;

import com.luv2code.tms.models.Category;

public class CategoryDao implements Dao<Category> {

    private List<Category> data_structure;

    public CategoryDao() {
        data_structure = new ArrayList<>();
    }

    @Override
    public List<Category> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category getOne(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int createOne(Category model) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean updateOne(Category model) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteOne(int id) {
        // TODO Auto-generated method stub
        return false;
    }

}