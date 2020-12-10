package com.mybank.tester;

import com.mybank.controller.Controller;
import com.mybank.dto.AccountDTO;
import com.mybank.dto.AddressDTO;
import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;
import com.mybank.model.AccountType;

public class Tester {
    private static final Controller controller = new Controller();

    public static void  addCustomer(){
        try{
            CustomerDTO customer = new CustomerDTO();
            customer.setName("Riya Das");
            customer.setId(1);
            customer.setEmail("riyadasr26@gmail.com");
            customer.setAge(20);

            AddressDTO address = new AddressDTO();
            address.setCity("Howrah");
            address.setState("West Bengal");
            address.setPinCode(711102);
            customer.setAddress(address);

            AccountDTO account = new AccountDTO();
            account.setAccountNo(17);
            account.setAccountType(AccountType.SAVINGS);
            account.setBalance(0);
            account.setBranch("Chatterjeehat");
            customer.setAccount(account);

            Integer id = controller.addCustomer(customer);
            System.out.println("New Customer added with id: "+id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void setPassword(){
        try{
            controller.setPassword("riyadasr26@gmail.com","Rhea2020");
            System.out.println("Password set successfully");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        addCustomer();
        setPassword();
    }
}
