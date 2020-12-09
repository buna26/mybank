package com.mybank.service;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;

public interface Service {
    Integer addCustomer(CustomerDTO customer) throws BankException;
}
