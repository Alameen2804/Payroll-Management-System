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

/*
Output: 
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
1
*****Employee Details*****
Enter employee name: 
Alameen
Enter employee age: 
23
Enter employee qualification: 
MCA
Enter employee designation: 
1.Junior
2.Senior
3.Lead
4.Manager
1
Enter date of birth: 
28041999
Enter door number: 
254
Enter street name: 
Manalmedu
Enter city name: 
Sendalai
Enter state name: 
TamilNadu
Enter pincode: 
614612
Enter experience: 
1
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
2
Enter employee id: 
1000
*****Details of Alameen*****
Employee [id=1000, name=Alameen, age=23, qualification=MCA, deignation=JUNIOR, dateOfBirth=28041999, adress=Address [doorNumber=254, street=Manalmedu, city=Sendalai, state=TamilNadu, pincode=614612], salary=0, leaveCount=0, experience=1]

1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
3
***Details of all employees***
*****All employees*****
[Employee [id=1000, name=Alameen, age=23, qualification=MCA, deignation=JUNIOR, dateOfBirth=28041999, adress=Address [doorNumber=254, street=Manalmedu, city=Sendalai, state=TamilNadu, pincode=614612], salary=0, leaveCount=0, experience=1]
]
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
4
Enter employee id: 
1000
Enter number of leave days: 
4
Leave updated!
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
5
Enter employee id: 
1000
Enter amount of salary: 
15000
Salary added!
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
6
Enter employee id: 
1000
Alameen's salary amount is: 13000
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
7
Enter employee id: 
1000
Leave balance of Alameen:14
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
8
Enter employee id: 
1000
Designation of Alameen:JUNIOR
1.Add employee
2.View single employee details
3.View employees
4.Leave update
5.Add salary
6.Calculate salary
7.Leave balance
8.View designation
9.Exit
Enter your choice: 
9 
*/
