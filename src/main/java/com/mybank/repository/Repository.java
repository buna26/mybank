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

public class Repository implements Repo{
    private final List<Customer> customers = new ArrayList<>();
    private final Map<String,String> credentials = new HashMap<>();

    @Override
    public Integer addCustomer(CustomerDTO customer) {
        Customer newCustomer = new Customer();
        newCustomer.setName(customer.getName());
        newCustomer.setId(customer.getId());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setAge(customer.getAge());

        Address newAddress = new Address();
        newAddress.setCity(customer.getAddress().getCity());
        newAddress.setState(customer.getAddress().getState());
        newAddress.setPinCode(customer.getAddress().getPinCode());

        Account newAccount = new Account();
        newAccount.setAccountNo(customer.getAccount().getAccountNo());
        newAccount.setAccountType(customer.getAccount().getAccountType());
        newAccount.setBalance(customer.getAccount().getBalance());
        newAccount.setBranch(customer.getAccount().getBranch());

        newCustomer.setAddress(newAddress);
        newCustomer.setAccount(newAccount);

        customers.add(newCustomer);
        return newCustomer.getId();
    }

    @Override
    public CustomerDTO findBy(Integer id, String email) {
        for (Customer customer : customers) {
            if(customer.getId().equals(id)){

                CustomerDTO dto = new CustomerDTO();
                dto.setName(customer.getName());
                dto.setId(customer.getId());
                dto.setEmail(customer.getEmail());
                dto.setAge(customer.getAge());

                AddressDTO dto1 = new AddressDTO();
                dto1.setCity(customer.getAddress().getCity());
                dto1.setState(customer.getAddress().getState());
                dto1.setPinCode(customer.getAddress().getPinCode());
                dto.setAddress(dto1);

                AccountDTO dto2 = new AccountDTO();
                dto2.setAccountNo(customer.getAccount().getAccountNo());
                dto2.setAccountType(customer.getAccount().getAccountType());
                dto2.setBalance(customer.getAccount().getBalance());
                dto2.setBranch(customer.getAccount().getBranch());

                dto.setAccount(dto2);
                return dto;
            }
            if (customer.getEmail().equals(email)) {
                CustomerDTO dto = new CustomerDTO();
                dto.setName(customer.getName());
                dto.setId(customer.getId());
                dto.setEmail(customer.getEmail());
                dto.setAge(customer.getAge());

                AddressDTO dto1 = new AddressDTO();
                dto1.setCity(customer.getAddress().getCity());
                dto1.setState(customer.getAddress().getState());
                dto1.setPinCode(customer.getAddress().getPinCode());
                dto.setAddress(dto1);

                AccountDTO dto2 = new AccountDTO();
                dto2.setAccountNo(customer.getAccount().getAccountNo());
                dto2.setAccountType(customer.getAccount().getAccountType());
                dto2.setBalance(customer.getAccount().getBalance());
                dto2.setBranch(customer.getAccount().getBranch());

                dto.setAccount(dto2);
                return dto;
            }
        }
        return null;
    }
}
