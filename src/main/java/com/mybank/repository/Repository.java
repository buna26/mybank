package com.mybank.repository;

import com.mybank.dto.CustomerDTO;

public interface Repository {
    Integer addCustomer(CustomerDTO customer);
    CustomerDTO findById(Integer id);
    CustomerDTO findByEmail(String email);

    void setPassword(String email, String password);
    String getPassword(String email);

    void depositBalance(CustomerDTO customer, Integer deposit);

    void withDrawBalance(CustomerDTO customer, Integer withdraw);
}
