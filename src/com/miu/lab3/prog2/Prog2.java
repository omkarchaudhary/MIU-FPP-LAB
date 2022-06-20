package com.miu.lab3.prog2;

import com.miu.lab3.prog2.Employee;

import java.util.Scanner;

public class Prog2 {
    Employee[] emps = null;
    public static void main(String[] args) {
        new Prog2();
    }
    Prog2(){
        emps = new Employee[3];
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[2] = new Employee("Susan Randolph", 1997, 2,13);

        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);
        emps[1].createNewChecking(34000);
        emps[1].createNewSavings(27000);
        emps[1].createNewRetirement(27000);
        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);


        Scanner sc = new Scanner(System.in);
        System.out.print("See a report of all account balances? (y/n) ");
        String answer = sc.next();
        if(answer.equalsIgnoreCase("y")){
            String info = getFormattedAccountInfo();
            System.out.println(info);
        }
        else {
            //do nothing..the application ends here
        }
    }
    String getFormattedAccountInfo(){
        //loop through employees array and get formatted
        //account info for each employee, and assemble into a string
        String output ="";
        for(int i  = 0; i< emps.length;i++){
            output +=  String.format("%s %n %n", "ACCOUNT INFO FOR "+emps[i].getName());
            output +=  String.format("%s %10s %n", "Account type: ",emps[i].getCheckingAcct().getAcctType());
            output +=  String.format("%s %10s %n", "Current bal: ",emps[i].getCheckingAcct().getBalance());
            output +=  String.format("%s %9s %n", "Account type: ",emps[i].getSavingsAcct().getAcctType());
            output +=  String.format("%s %10s %n", "Current bal: ",emps[i].getSavingsAcct().getBalance());
            output +=  String.format("%s %12s %n", "Account type: ",emps[i].getRetirementAcct().getAcctType());
            output +=  String.format("%s %9s %n %n", "Current bal: ",emps[i].getRetirementAcct().getBalance());

        }
        return output;
    }
}
