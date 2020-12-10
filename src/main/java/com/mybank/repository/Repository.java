package com.mybank.repository;

import com.mybank.dto.CustomerDTO;

public interface Repository {
    Integer addCustomer(CustomerDTO customer);
    CustomerDTO findById(Integer id);
    CustomerDTO findByEmail(String email);
}
