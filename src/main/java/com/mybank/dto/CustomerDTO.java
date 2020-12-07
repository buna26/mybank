package com.mybank.dto;

public class CustomerDTO {
    private String name;
    private Integer id;
    private String email;
    private Integer age;
    private AddressDTO address;
    private AccountDTO account;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }

    public void setAddress(AddressDTO address){
        this.address = address;
    }
    public AddressDTO getAddress(){
        return address;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }
    public AccountDTO getAccount(){
        return account;
    }
}
