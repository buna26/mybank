package com.mybank.repository;

import com.mybank.dto.CustomerDTO;

public interface Repo {
    Integer addCustomer(CustomerDTO customer);
    CustomerDTO findBy(Integer id,String email);
}
