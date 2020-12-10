package com.mybank.service;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;
import com.mybank.repository.Repository;
import com.mybank.repository.RepositoryImpl;
import com.mybank.validator.Validator;

public class ServiceImpl implements Service{
    private final Repository repository = new RepositoryImpl();
    @Override
    public Integer addCustomer(CustomerDTO customer) throws BankException {
        Validator.validate(customer);
        if(repository.findById(customer.getId())!= null){
            throw new BankException("customer already exist");
        }
        return repository.addCustomer(customer);
    }

    @Override
    public void setPassword(String email, String password) throws BankException {
        repository.setPassword(email,password);
        if(repository.findByEmail(email) == null){
            throw new BankException("No such customer exists!");
        }
    }
}