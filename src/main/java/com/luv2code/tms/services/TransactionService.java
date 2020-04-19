package com.luv2code.tms.services;

import java.util.List;

import com.luv2code.tms.inputs.TransactionFilters;
import com.luv2code.tms.models.Transaction;

public interface TransactionService {

    List<Transaction> getAll(TransactionFilters input);

    Integer getMonthFrequent(Integer id);

    Boolean updateFrequent(Integer id, Integer monthFrequent);
}
