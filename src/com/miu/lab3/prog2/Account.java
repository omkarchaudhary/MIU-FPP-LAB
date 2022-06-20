package com.miu.lab3.prog2;

public class Account {
    private final static double DEFAULT_BALANCE = 0.0;
    private double balance;
    private String acctType;
    private Employee employee;

    public Account(Employee emp, String acctType, double balance){
    //public Account(String acctType, double balance) {
        employee = emp;
        this.acctType = acctType;
        this.balance = balance;
    }

    Account(Employee emp, String acctType) {
        this(emp, acctType, DEFAULT_BALANCE);
    }

    public String toString() {
        return "type = " + acctType + ", balance = " + balance;
    }

    public void makeDeposit(double deposit) {
        this.balance += deposit;
    }

    public boolean makeWithdrawal(double amount) {
        boolean balanceDrawl = amount > balance ? false : true;
        if (balanceDrawl)
            balance = balance - amount;
        return balanceDrawl;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAcctType() {
        return acctType;
    }

    public double getBalance() {
        return balance;
    }
}
