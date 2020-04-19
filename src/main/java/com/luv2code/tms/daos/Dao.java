package com.luv2code.tms.daos;

import java.util.List;

import com.luv2code.tms.models.Model;

public interface Dao<T extends Model> {

    List<T> getAll();

    T getOne(int id);

    int createOne(T model);

    boolean updateOne(T model);

    boolean deleteOne(int id);
}