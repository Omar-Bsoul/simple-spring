package com.luv2code.tms.services;

import com.luv2code.tms.inputs.TransactionFilters;
import com.luv2code.tms.models.Expense;
import com.luv2code.tms.models.Income;

public interface AccountService {

    Double getBalance(TransactionFilters filters);

    Integer createIncome(Income income);

    Integer createExpense(Expense expense);
}
