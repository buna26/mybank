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

    @Override
    public Boolean loginCustomer(String email, String password) throws BankException {
        String passwordFromRepo = repository.getPassword(email);
        if(passwordFromRepo == null){
            throw new BankException("Invalid credentials");
        }
        else{
            return passwordFromRepo.equals(password);
        }
    }

    @Override
    public Integer getBalance(String email) throws BankException {
        CustomerDTO customer = repository.findByEmail(email);
        if(customer == null){
            throw new BankException("No such customer exist");
        }
        else{
            return customer.getAccount().getBalance();
        }
    }

    @Override
    public Integer depositBalance(String email, Integer deposit) throws BankException {
        CustomerDTO customer = repository.findByEmail(email);
        if(customer == null) {
            throw new BankException("No such customer exists!");
        }
        repository.depositBalance(customer, deposit);
        return deposit;
    }

    @Override
    public Integer withDrawBalance(String email, Integer withdraw) throws BankException {
        CustomerDTO customer = repository.findByEmail(email);
        if(customer == null) {
            throw new BankException("No such customer exists!");
        }
        repository.withDrawBalance(customer, withdraw);
        return withdraw;
    }
}