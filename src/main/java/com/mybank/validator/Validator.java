package com.mybank.validator;

import com.mybank.dto.CustomerDTO;
import com.mybank.exception.BankException;

public class Validator {
    public static boolean isValidName(String name){
        String[] arr = name.split(" ");
        if(arr.length<2){return false;}
        return Character.isUpperCase(arr[0].charAt(0)) && Character.isUpperCase(arr[1].charAt(0));
    }
    public static boolean isValidEmail(String email){
        return email.indexOf('@')!= -1;
    }

    public static  void validate(CustomerDTO customer) throws BankException{
        if(!isValidName(customer.getName())){
            throw new BankException("Invalid name format!");
        }
        if(!isValidEmail(customer.getEmail())){
                throw new BankException("Invalid email format");
        }
    }
}
