package com.mybank.model;

import java.util.Objects;

public class Customer {
    private String name;
    private Integer id;
    private String email;
    private Integer age;
    private Address address;
    private Account account;

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

    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public Account getAccount(){
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", account=" + account +
                '}';
    }
}
