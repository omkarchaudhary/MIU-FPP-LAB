package com.miu.lab3.prog1;

import com.miu.lab3.prog1.Account;
import com.miu.lab3.prog1.AccountType;
import com.miu.lab3.prog1.Employee;

public class Prog1 {
    public static void main(String[] args) {
        Employee employee = new Employee("James Aaron","James",2000,2022,4,1);
        Account checkingAccount = new Account(employee, AccountType.CHECKING.toString(),300);
        Account savingAccount = new Account(employee,AccountType.SAVINGS.toString(),300);
        Account retireAccount = new Account(employee,AccountType.RETIREMENT.toString(),300);
        System.out.println(checkingAccount.toString());
        System.out.println(savingAccount.toString());
        System.out.println(retireAccount.toString());
    }
}
