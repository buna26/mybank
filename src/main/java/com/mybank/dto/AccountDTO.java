package com.mybank.dto;

import com.mybank.model.AccountType;

public class AccountDTO {
    private Integer accountNo;
    private AccountType accountType;
    private Integer balance;
    private String branch;

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }
    public Integer getAccountNo(){
        return accountNo;
    }

    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }
    public AccountType getAccountType(){
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
