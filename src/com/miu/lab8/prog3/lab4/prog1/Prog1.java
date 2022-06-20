package com.miu.lab8.prog3.lab4.prog1;

import java.time.LocalDate;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("James", LocalDate.parse ("2022-05-28"),2000);
        Professor prof2 = new Professor("Bob", LocalDate.parse ("2022-05-28"),2000);
        Professor prof3 = new Professor("Marly", LocalDate.parse ("2022-05-28"),2000);
        prof1.setNumberOfPublications(10);
        prof2.setNumberOfPublications(10);
        prof3.setNumberOfPublications(10);
        Secretary sec1 = new Secretary("Simran", LocalDate.parse ("2022-05-28"),1000);
        Secretary sec2 = new Secretary("Kate", LocalDate.parse ("2022-05-28"),1000);
        sec1.setOvertimeHours(200);
        sec2.setOvertimeHours(200);

        DeptEmployee[] department = {prof1,prof2,prof3,sec1,sec2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to the sum of all salaries of department: Y/N ");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("Y")){
            double totalSalary = 0;
            for(DeptEmployee deptEmployee : department){
                totalSalary += deptEmployee.computeSalary();
            }
            System.out.println("The total salaries of department is :"+ totalSalary);
        }
    }
}
