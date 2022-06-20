package com.miu.lab8.prog3.lab4.prog3;

import com.miu.lab3.prog1.AccountType;

public class RetirementAccount extends Account{

    private static final double PENALTY_AMOUNT = 2;
    public RetirementAccount(Employee emp, double balance) {
        super(emp, balance);
    }
    public AccountType getAccountType(){
        return AccountType.RETIREMENT;
    }

    @Override
    public double getBalance() {
        double baseBalance = super.getBalance();
        double penalty = (PENALTY_AMOUNT/100)*baseBalance;
        return baseBalance-penalty;
    }
}
