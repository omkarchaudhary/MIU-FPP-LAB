package com.miu.lab8.prog3.lab4.prog3;

import com.miu.lab3.prog1.AccountType;

public class CheckingAccount extends Account{
    private static final double SERVICE_CHARGE = 5;
    public CheckingAccount(Employee emp, double balance) {
        super(emp, balance);
    }
    public AccountType getAccountType(){
        return AccountType.CHECKING;
    }

    @Override
    public double getBalance() {
        return super.getBalance() - SERVICE_CHARGE;
    }

    @Override
    public String toString(){
        return ""+getAccountType();
    }
}
