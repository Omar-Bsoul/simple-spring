package com.luv2code.tms.daos;

import java.util.ArrayList;
import java.util.List;

import com.luv2code.tms.models.Transaction;

public class TransactionDao implements Dao<Transaction> {
    private List<Transaction> data_structure;

    public TransactionDao() {
        data_structure = new ArrayList<>();

        data_structure.add(new Transaction());
    }

    @Override
    public List<Transaction> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Transaction getOne(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int createOne(Transaction model) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean updateOne(Transaction model) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteOne(int id) {
        // TODO Auto-generated method stub
        return false;
    }
}