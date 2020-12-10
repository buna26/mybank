package com.mybank.tester;

import com.mybank.controller.Controller;
import com.mybank.dto.AccountDTO;
import com.mybank.dto.AddressDTO;
import com.mybank.dto.CustomerDTO;
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

    public static void loginCustomer(){
        try{
            Boolean isSuccess = controller.loginCustomer("riyadasr26@gmail.com","Rhea2020");
            if(isSuccess){
                System.out.println("Logged in!");
            }
            else{
                System.out.println("Not logged in!");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void getBalance() {
        try{
            Integer balance = controller.getBalance("riyadasr26@gmail.com");
            System.out.println("The current account balance is: "+balance);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void depositBalance() {
        try{
            Integer deposit = controller.depositBalance("riyadasr26@gmail.com",100);
            System.out.println("Rs."+deposit+" has been credited to the account");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void widthDrawBalance() {
        try{
            Integer widthDraw = controller.withDrawBalance("riyadasr26@gmail.com",10);
            System.out.println("Rs."+widthDraw+" has been withdrawn from the account");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        addCustomer();

        setPassword();

        loginCustomer();
        getBalance();

        depositBalance();
        getBalance();

        widthDrawBalance();
        getBalance();
    }
}
