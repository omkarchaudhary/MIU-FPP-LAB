package com.miu.lab8.prog3.lab4.prog3;


import java.util.Scanner;

public class Prog3 {

    static Employee[] emps = null;
    Prog3(){
        emps = new Employee[3];
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);

//	emps[0].deposit(AccountType.CHECKING.toString(), 50);
//	emps[0].withdraw(AccountType.CHECKING.toString(), 500);

        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[1].createNewChecking(34000);
//	emps[1].createNewSavings(27000);
        emps[1].createNewRetirement(7300);


        emps[2] = new Employee("Susan Randolph", 1997, 2,13);
        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);




    }



    public static void main(String[] args) {
        new Prog3();
        int selectedEmloyee;
        int selectedAccount;
        Scanner sc = new Scanner(System.in);

        //displayOptions();
        System.out.println("Do you want to review(y/n)");
        String inputString = sc.nextLine();
        if(inputString.equalsIgnoreCase("y")) {
            displayOptions();
            inputString = sc.nextLine();
            if(inputString.equalsIgnoreCase("A")){
                displayAllAccounts();

            } else if (inputString.equalsIgnoreCase("B")) {
                displayEmployee();
                selectedEmloyee = sc.nextInt();
                if(selectedEmloyee == 0){
                    displayAccount(0);
                    selectedAccount = sc.nextInt();
                    System.out.println("Deposit Amount: ");

                    double depositedamount  = sc.nextDouble();
                    String employeeName=emps[selectedEmloyee].getName();
                    String acccountName=emps[selectedEmloyee].accounts.getAccount()[selectedAccount].toString();
                    String output = "$"+depositedamount+" has been deposited in the "+acccountName+" account of "+employeeName;
                    emps[selectedEmloyee].deposit(selectedAccount, depositedamount);
                    //System.out.printf("$ %d has been deposited in the %s account of %s",depositedamount,acccountName,employeeName);
                    System.out.println(output);
                } else if (selectedEmloyee == 1){
                    displayAccount(1);
                    selectedAccount = sc.nextInt();
                    System.out.println("Deposit Amount: ");

                    double depositedamount  = sc.nextDouble();
                    String employeeName=emps[selectedEmloyee].getName();
                    String acccountName=emps[selectedEmloyee].accounts.getAccount()[selectedAccount].toString();
                    String output = "$"+depositedamount+" has been deposited in the "+acccountName+" account of "+employeeName;
                    emps[selectedEmloyee].deposit(selectedAccount, depositedamount);
                    //System.out.printf("$ %d has been deposited in the %s account of %s",depositedamount,acccountName,employeeName);
                    System.out.println(output);
                } else if (selectedEmloyee == 3){
                    displayAccount(3);
                    selectedAccount = sc.nextInt();
                    System.out.println("Deposit Amount: ");

                    double depositedamount  = sc.nextDouble();
                    String employeeName=emps[selectedEmloyee].getName();
                    String acccountName=emps[selectedEmloyee].accounts.getAccount()[selectedAccount].toString();
                    String output = "$"+depositedamount+" has been deposited in the "+acccountName+" account of "+employeeName;
                    emps[selectedEmloyee].deposit(selectedAccount, depositedamount);
                    //System.out.printf("$ %d has been deposited in the %s account of %s",depositedamount,acccountName,employeeName);
                    System.out.println(output);
                }
            } else if (inputString.equalsIgnoreCase("C")) {
                displayEmployee();
                selectedEmloyee = sc.nextInt();
                if(selectedEmloyee == 0){
                    displayAccount(0);
                    selectedAccount = sc.nextInt();
                    System.out.println("Withdraw Amount: ");

                    double depositedamount  = sc.nextDouble();
                    String employeeName=emps[selectedEmloyee].getName();
                    String acccountName=emps[selectedEmloyee].accounts.getAccount()[selectedAccount].toString();
                    String output = "$"+depositedamount+" has been withdraw in the "+acccountName+" account of "+employeeName;
                    emps[selectedEmloyee].withdraw(selectedAccount, depositedamount);
                    //System.out.printf("$ %d has been Withdraw in the %s account of %s",depositedamount,acccountName,employeeName);
                    System.out.println(output);
                } else if (selectedEmloyee == 1){
                    displayAccount(1);
                    selectedAccount = sc.nextInt();
                    System.out.println("Withdraw Amount: ");

                    double depositedamount  = sc.nextDouble();
                    String employeeName=emps[selectedEmloyee].getName();
                    String acccountName=emps[selectedEmloyee].accounts.getAccount()[selectedAccount].toString();
                    String output = "$"+depositedamount+" has been withdraw in the "+acccountName+" account of "+employeeName;
                    emps[selectedEmloyee].withdraw(selectedAccount, depositedamount);
                    //System.out.printf("$ %d has been deposited in the %s account of %s",depositedamount,acccountName,employeeName);
                    System.out.println(output);
                } else if (selectedEmloyee == 3){
                    displayAccount(3);
                    selectedAccount = sc.nextInt();
                    System.out.println("Withdraw Amount: ");

                    double depositedamount  = sc.nextDouble();
                    String employeeName=emps[selectedEmloyee].getName();
                    String acccountName=emps[selectedEmloyee].accounts.getAccount()[selectedAccount].toString();
                    String output = "$"+depositedamount+" has been withdraw in the "+acccountName+" account of "+employeeName;
                    emps[selectedEmloyee].withdraw(selectedAccount, depositedamount);
                    //System.out.printf("$ %d has been deposited in the %s account of %s",depositedamount,acccountName,employeeName);
                    System.out.println(output);
                }
            }
        } else {
            System.exit(0);
        }

    }

    static void displayAllAccounts() {
        String output="";
        for(int i  = 0; i< emps.length;i++){
            //output="";
            output +=  String.format("%n %s %n %n", "ACCOUNT INFO FOR "+emps[i].getName());
            for(int j =0 ; j<emps[i].accounts.size() ;j++) {
                output +=  String.format("%s %10s %n", "Account type: ",emps[i].accounts.getAccount()[j].toString());
                output +=  String.format("%s %10s %n", "Current bal: ",emps[i].accounts.getAccount()[j].getBalance());
            }
            //   output +=  String.format("%s %10s %n", "Account type: ",emps[i].accounts.getAccount()[i].toString());
        }

        System.out.println(output);

    }
    static void displayOptions() {
        String n = System.getProperty("line.separator");
        String display =
                "A. See a report of all accounts." + n +
                        "B.  Make a deposit." + n +
                        "C.  Make a withdrawal." + n +
                        "Make a selection (A/B/C): " ;
        System.out.println(display);

    }

    static void displayEmployee(){
        String n = System.getProperty("line.separator");
        String display ="";
        for(int i  = 0; i< emps.length;i++){
            display += i+". "+emps[i].getName()+n;
        }
        display += "Select an employee: (type a number): " ;
        System.out.println(display);
    }
    static void displayAccount(int employeeIndex){
        String n = System.getProperty("line.separator");

        AccountList ac= emps[employeeIndex].accounts;

        // System.out.println(Arrays.toString(ac.getAccount())  );



        String display ="";
        for(int i  = 0; i< ac.size();i++){
            display +=i+". "+ac.getAccount()[i].toString()+n;
        }
        display += "Select an account: (type a number): " ;
        System.out.println(display);
    }

}
