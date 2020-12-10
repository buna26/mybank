package com.mybank.service;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;

public interface Service {
    Integer addCustomer(CustomerDTO customer) throws BankException;

    void setPassword(String email, String password) throws BankException;

    Boolean loginCustomer(String email, String password) throws BankException;

    Integer getBalance(String email) throws BankException;

    Integer depositBalance(String email, Integer deposit) throws BankException;
}
