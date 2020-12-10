package com.mybank.controller;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;
import com.mybank.service.Service;
import com.mybank.service.ServiceImpl;

import java.security.Provider;

public class Controller {
    private final Service service = new ServiceImpl();

    public Integer addCustomer(CustomerDTO customer) throws BankException {
        return service.addCustomer(customer);
    }

    public void setPassword(String email, String password) throws BankException {
        service.setPassword(email,password);
    }
}
