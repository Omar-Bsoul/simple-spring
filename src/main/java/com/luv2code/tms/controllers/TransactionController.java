package com.luv2code.tms.controllers;

import java.util.List;

import com.luv2code.tms.daos.Dao;
import com.luv2code.tms.inputs.TransactionFilters;
import com.luv2code.tms.models.Transaction;
import com.luv2code.tms.services.TransactionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/transactions")
public class TransactionController implements TransactionService {

    private Dao<Transaction> dao;

    public TransactionController(Dao<Transaction> dao) {
        this.dao = dao;
    }

    @GetMapping("/")
    @Override
    public @ResponseBody List<Transaction> getAll(@RequestParam TransactionFilters input) {
        return dao.getAll();
    }

    @GetMapping("/month-frequent/{id}")
    @Override
    public @ResponseBody Integer getMonthFrequent(@PathVariable(value = "id") Integer id) {
        return 0;
    }

    @PutMapping("/month-frequent/{id}")
    @Override
    public @ResponseBody Boolean updateFrequent(@PathVariable(value = "id") Integer id,
            @RequestBody Integer monthFrequent) {
        return false;
    }
}