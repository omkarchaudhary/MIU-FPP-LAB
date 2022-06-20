package com.miu.lab8.prog3.lab4.prog3;

import java.time.LocalDate;
import java.util.Arrays;

public class Employee {
    AccountList accounts;
    private String name;
    private LocalDate hireDate;

    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
        hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
        accounts = new AccountList();

    }


    @Override
    public String toString() {
        return "Employee [accounts=" + accounts + ", name=" + name + ", hireDate=" + hireDate + "]";
    }


    public void createNewChecking(double startAmount) {

        Account acct = new CheckingAccount(this, startAmount);
        //  accounts= new AccountList();
        accounts.add(acct);
        // implement
        //checkingAcct=new Account(this, AccountType.CHECKING, startAmount);
    }

    public void createNewSavings(double startBalance) {
        Account acct = new SavingsAccount(this, startBalance);
        //accounts is the name of the AccountList variable

        accounts.add(acct);
    }


    public void createNewRetirement(double startAmount) {
        // implement
        Account acct = new RetirementAccount(this, startAmount);
        accounts.add(acct);
        //retirementAcct=new Account(this,AccountType.RETIREMENT, startAmount);

    }

    public String getFormattedAcctInfo() {
        // implement

        if (accounts.getAccount() != null) {

            //	for(int i=0;i<accounts.size();i++) {


            return Arrays.toString(accounts.getAccount());


            //}

        }

        return "";
    }

//	public Account getSavingsAcct() {
//		return savingsAcct;
//	}
//
//	public Account getCheckingAcct() {
//		return checkingAcct;
//	}
//
//	public Account getRetirementAcct() {
//		return retirementAcct;
//	}


    public String getName() {
        return name;
    }


    public LocalDate getHireDate() {
        return hireDate;
    }


    public void deposit(int accountIndex, double amt) {
//		// implement
        Account selected = accounts.get(accountIndex);
        selected.makeDeposit(amt);
    }


    public boolean withdraw(int accountIndex, double amt) {

        Account selected = accounts.get(accountIndex);
        boolean withdraw = selected.makeWithdrawal(amt);

        if (!withdraw) {
            System.out.println("because of insufficient funds");
            return false;
        }

        return true;

    }
}
