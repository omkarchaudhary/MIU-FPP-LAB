package com.miu.lab6.prog3;

import com.miu.lab8.prog3.lab4.prog3.Employee;

public class Main {
    Employee[] emps = null;
    public static void main(String[] args) {
        new Main();

        UserIO gui = new UserIO();
        gui.setOutputValue("See a report of all account balances? (y/n)");
        gui.setVisible(true);
    }
    Main(){
        emps = new Employee[3];
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[2] = new Employee("Susan Randolph", 1997, 2,13);

        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);
        emps[1].createNewChecking(34000);
        emps[1].createNewSavings(27000);
        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);



        //Scanner sc = new Scanner(System.in);
//		System.out.print("See a report of all account balances? (y/n) ");
//		if(answer.equalsIgnoreCase("y")){
//			String info = getFormattedAccountInfo();
//			System.out.println(info);
//		}
//		else {
//			//do nothing..the application ends here
//		}

        //sc.close();
    }
    String getFormattedAccountInfo(){
        //loop through employees array and get formatted
        //account info for each employee, and assemble into a string
        String output = "";
        for(Employee employee : emps) {

            output += String.format("%nACCOUNT INFO FOR %s: %n %n", employee.getName());
            output += String.format("%s", employee.getFormattedAcctInfo());
        }

        return output;
    }
}
