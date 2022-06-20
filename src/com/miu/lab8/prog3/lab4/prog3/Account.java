package com.miu.lab8.prog3.lab4.prog3;

public class Account {
    private final static double DEFAULT_BALANCE = 0.0;
    private double balance;
    private Employee employee;

    public Account(Employee emp, double balance){
    //public Account(String acctType, double balance) {
        employee = emp;
        this.balance = balance;
    }

    Account(Employee emp, String acctType) {
        this(emp, DEFAULT_BALANCE);
    }

    public String toString() {
        //return "type = " + acctType + ", balance = " + balance;
        return "balance = " + balance;
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

    public double getBalance() {
        return balance;
    }
}
