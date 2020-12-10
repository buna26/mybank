package com.mybank.repository;

import com.mybank.dto.AccountDTO;
import com.mybank.dto.AddressDTO;
import com.mybank.dto.CustomerDTO;
import com.mybank.model.Account;
import com.mybank.model.Address;
import com.mybank.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryImpl implements Repository{
    private final List<Customer> customers = new ArrayList<>();
    private final Map<String, String> credentials = new HashMap<>();
    @Override
    public Integer addCustomer(CustomerDTO customer) {

        Customer newCustomer =  new Customer();
        newCustomer.setId(customer.getId());
        newCustomer.setName(customer.getName());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setAge(customer.getAge());

        Address address = new Address();
        address.setCity(customer.getAddress().getCity());
        address.setState(customer.getAddress().getState());
        address.setPinCode(customer.getAddress().getPinCode());

        newCustomer.setAddress(address);

        Account account = new Account();
        account.setAccountNo(customer.getAccount().getAccountNo());
        account.setAccountType(customer.getAccount().getAccountType());
        account.setBalance(customer.getAccount().getBalance());
        account.setBranch(customer.getAccount().getBranch());

        newCustomer.setAccount(account);

        customers.add(newCustomer);

        return newCustomer.getId();
    }
    @Override
    public CustomerDTO findById(Integer id) {
        for(Customer customer : customers){
            if(customer.getId().equals(id)){
                CustomerDTO dto =  new CustomerDTO();
                dto.setId(customer.getId());
                dto.setName(customer.getName());
                dto.setEmail(customer.getEmail());
                dto.setAge(customer.getAge());

                AddressDTO addressDTO = new AddressDTO();
                addressDTO.setCity(customer.getAddress().getCity());
                addressDTO.setState(customer.getAddress().getState());
                addressDTO.setPinCode(customer.getAddress().getPinCode());

                AccountDTO accountDTO = new AccountDTO();

                accountDTO.setAccountNo(customer.getAccount().getAccountNo());
                accountDTO.setAccountType(customer.getAccount().getAccountType());
                accountDTO.setBalance(customer.getAccount().getBalance());
                accountDTO.setBranch(customer.getAccount().getBranch());

                dto.setAccount(accountDTO);
                dto.setAddress(addressDTO);
                return dto;
            }
        }
        return null;
    }

    @Override
    public CustomerDTO findByEmail(String email) {
        for(Customer customer : customers){
            if(customer.getEmail().equals(email)){
                CustomerDTO dto =  new CustomerDTO();

                dto.setId(customer.getId());
                dto.setName(customer.getName());
                dto.setEmail(customer.getEmail());
                dto.setAge(customer.getAge());

                AddressDTO addressDTO = new AddressDTO();
                addressDTO.setCity(customer.getAddress().getCity());
                addressDTO.setState(customer.getAddress().getState());
                addressDTO.setPinCode(customer.getAddress().getPinCode());

                AccountDTO accountDTO = new AccountDTO();

                accountDTO.setAccountNo(customer.getAccount().getAccountNo());
                accountDTO.setAccountType(customer.getAccount().getAccountType());
                accountDTO.setBalance(customer.getAccount().getBalance());
                accountDTO.setBranch(customer.getAccount().getBranch());

                dto.setAccount(accountDTO);
                dto.setAddress(addressDTO);
                return dto;
            }
        }
        return null;
    }

    @Override
    public void setPassword(String email, String password) {
        credentials.put(email,password);
    }

    @Override
    public String getPassword(String email) {
        return credentials.get(email);
    }
}
