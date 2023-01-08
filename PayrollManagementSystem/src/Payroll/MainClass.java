package Payroll;

import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		Payroll payroll=new Payroll();
		int choice,i=0;
		
		while(i==0)
		{
			System.out.println("1.Add employee\n" +
					"2.View single employee details\n" +
					"3.View employees\n" +
					"4.Leave update\n" +
					"5.Add salary\n" +
					"6.Calculate salary\n" +
					"7.Leave balance\n" +
					"8.View designation\n" +
					"9.Exit");
			
			System.out.println("Enter your choice: ");
			choice=scan.nextInt();
			switch(choice){
			
			case 1:
				payroll.addEmployee();
				break;
			case 2:
				payroll.viewEmployee();
				break;
			case 3:
				System.out.println("***Details of all employees***");
				payroll.viewEmployees();
				break;
			case 4:
				payroll.leaveUpdate();
				break;		
			case 5:
				payroll.addSalary();
				break;
			case 6:
				payroll.calculateSalary();
				break;
			case 7:
				payroll.leaveBalance();
				break;
			case 8:
				payroll.viewDesignation();
				break;
			case 9:
				i=1;
				break;
			}
		}
	}
}
