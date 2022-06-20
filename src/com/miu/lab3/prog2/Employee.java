package com.miu.lab3.prog2;

import com.miu.lab3.prog1.AccountType;

import java.time.LocalDate;

public class Employee {
    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;
    private String name;
    private LocalDate hireDate;

    public Employee(String name, int yearOfHire,
                    int monthOfHire, int dayOfHire) {
        this.name = name;
//Replace these lines with LocalDate references
//GregorianCalendar cal =
        //new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
//hireDate = cal.getTime();
        this.hireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
    }
    public Account getSavingsAcct(){
        return  this.savingsAcct;
    }

    public Account getCheckingAcct() {
        return this.checkingAcct;
    }

    public Account getRetirementAcct() {
        return this.retirementAcct;
    }

    public String getName(){
        return this.name;
    }
    public LocalDate getHireDate(){
        return this.hireDate;
    }
    public void createNewChecking(double startAmount) {
// implement
        checkingAcct = new Account(this,AccountType.CHECKING.toString(), startAmount);

    }

    public void createNewSavings(double startAmount) {
// implement
        savingsAcct = new Account(this,AccountType.SAVINGS.toString(), startAmount);
    }

    public void createNewRetirement(double startAmount) {
// implement
        retirementAcct = new Account(this,AccountType.RETIREMENT.toString(), startAmount);
    }

    public void deposit(AccountType acctType, double amt) {
// implement
        switch(acctType){
            case CHECKING:
                checkingAcct.makeDeposit(amt);
                break;
            case SAVINGS:
                savingsAcct.makeDeposit(amt);
                break;
            case RETIREMENT:
                retirementAcct.makeDeposit(amt);
                break;
            default:
        }
    }

    public boolean withdraw(AccountType acctType, double amt) {
// implement
        if (acctType == AccountType.CHECKING) {
            checkingAcct.makeWithdrawal(amt);
        } else if (acctType == AccountType.SAVINGS) {
            savingsAcct.makeWithdrawal(amt);
        } else if (acctType == AccountType.RETIREMENT) {
            retirementAcct.makeWithdrawal(amt);
        }
        return false;
    }

    public String getFormattedAcctInfo() {
// implement
        return null;
    }
}
