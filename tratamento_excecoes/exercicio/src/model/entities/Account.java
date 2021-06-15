package model.entities;

import model.exceptions.DomainExcpetion;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance = balance + amount;
    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            throw new DomainExcpetion("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainExcpetion("Not enough balance");
        }
        this.balance -= amount;
    }

}
