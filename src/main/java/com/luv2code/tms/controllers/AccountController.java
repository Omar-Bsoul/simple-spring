package com.luv2code.tms.controllers;

import com.luv2code.tms.inputs.TransactionFilters;
import com.luv2code.tms.models.Expense;
import com.luv2code.tms.models.Income;
import com.luv2code.tms.services.AccountService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class AccountController implements AccountService {

    public AccountController() {

    }

    @GetMapping("/balance")
    @Override
    public @ResponseBody Double getBalance(@RequestParam TransactionFilters filters) {
        // TODO Auto-generated method stub
        return 0.0;
    }

    @PostMapping("/income")
    @Override
    public @ResponseBody Integer createIncome(@RequestBody Income income) {
        // TODO Auto-generated method stub
        return 0;
    }

    @PostMapping("/expenses")
    @Override
    public @ResponseBody Integer createExpense(@RequestBody Expense expense) {
        // TODO Auto-generated method stub
        return 0;
    }
}