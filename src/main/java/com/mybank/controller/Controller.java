package com.mybank.controller;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;
import com.mybank.service.Service;
import com.mybank.service.ServiceImpl;

public class Controller {
    private final Service service = new ServiceImpl();

    public Integer addCustomer(CustomerDTO customer) throws BankException {
        return service.addCustomer(customer);
    }

    public void setPassword(String email, String password) throws BankException {
        service.setPassword(email,password);
    }

    public Boolean loginCustomer(String email, String password) throws BankException{
        return service.loginCustomer(email,password);
    }

    public Integer getCurrentBalance(String email) throws BankException{
        return service.getBalance(email);
    }
}
