package com.luv2code.tms;

import com.luv2code.tms.daos.CategoryDao;
import com.luv2code.tms.daos.Dao;
import com.luv2code.tms.daos.TransactionDao;
import com.luv2code.tms.models.Category;
import com.luv2code.tms.models.Transaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Dao<Transaction> transactionDao() {
        return new TransactionDao();
    }

    @Bean
    public Dao<Category> categoryDao() {
        return new CategoryDao();
    }
}