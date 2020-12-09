package com.mybank.service;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;
import com.mybank.repository.Repo;
import com.mybank.repository.Repository;

public class ServiceImpl implements Service{
    private final Repo repository = new Repository();
    @Override
    public Integer addCustomer(CustomerDTO customer) throws BankException {

        return null;
    }
}
