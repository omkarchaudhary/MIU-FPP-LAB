package com.miu.lab8.prog3.lab4.prog3;

import com.miu.lab3.prog1.AccountType;

public class SavingsAccount extends  Account{
    private static final double INTEREST_RATE = 0.25;
    public SavingsAccount(Employee emp, double balance) {
        super(emp, balance);
    }

    public AccountType getAccountType(){
        return AccountType.SAVINGS;
    }

    @Override
    public double getBalance() {
        double baseBalance =  super.getBalance();
        double interest = (INTEREST_RATE/100)*baseBalance;
        return baseBalance+interest;
    }
}
