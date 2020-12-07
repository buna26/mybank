package com.mybank.model;

public class Account {
    private Integer accountNo;
    private String accountType;
    private Integer balance;
    private String branch;

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }
    public Integer getAccountNo(){
        return accountNo;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public String getAccountType(){
        return accountType;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }
}
