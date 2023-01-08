package Payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payroll {
	
	Scanner scan=new Scanner(System.in);
	List<Employee> employeeList=new ArrayList<Employee>();
	
	public void addEmployee()
	{
		int id=1000;
		String name; 
		int age;
		String qualification;
		int localDesignation;
		Designation designation=null;
		String dateOfBirth;
		String doorNumber;
		String street;
		String city;
		String state;
		String pincode;
		int salary=0;
		int leaveCount=0;
		int experience=0;
		
		System.out.println("*****Employee Details*****");
		System.out.println("Enter employee name: ");
		name=scan.next();
		System.out.println("Enter employee age: ");
		age=scan.nextInt();
		System.out.println("Enter employee qualification: ");
		qualification=scan.next();
		System.out.println("Enter employee designation: \n1.Junior\n2.Senior\n3.Lead\n4.Manager");
		localDesignation=scan.nextInt();
		System.out.println("Enter date of birth: ");
		dateOfBirth=scan.next();
		System.out.println("Enter door number: ");
		doorNumber=scan.next();
		System.out.println("Enter street name: ");
		street=scan.next();
		System.out.println("Enter city name: ");
		city=scan.next();
		System.out.println("Enter state name: ");
		state=scan.next();
		System.out.println("Enter pincode: ");
		pincode=scan.next();
		System.out.println("Enter experience: ");
		experience=scan.nextInt();
		
		while(designation==null)
		{
			switch(localDesignation)
			{
			case 1:
				designation=Designation.JUNIOR;
				break;
			case 2:
				designation=Designation.SENIOR;
				break;
			case 3:
				designation=Designation.LEAD;
				break;
			case 4:
				designation=Designation.MANAGER;
				break;	
			}
		}
		
		employeeList.add(new Employee(id+employeeList.size(),name,age,qualification,designation,dateOfBirth,
				new Address(doorNumber,street,city,state,pincode),salary,leaveCount,experience));
	}
	
	public void viewEmployees()
	{
		System.out.println("*****All employees*****");
		System.out.println(employeeList);
	}
	
	public void viewEmployee()
	{
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		for(Employee employee: employeeList)
		{
			if(employee.getId()==id)
			{
				System.out.println("*****Details of "+employee.getName()+"*****");
				System.out.println(employee.toString());
			}
		}
	}
	
	public void leaveUpdate()
	{
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		System.out.println("Enter number of leave days: ");
		int leaveDays=scan.nextInt();
		for(Employee employee: employeeList)
		{
			if(employee.getId()==id)
			{
				employee.setLeaveCount(leaveDays+employee.getLeaveCount());
			}
		}
		System.out.println("Leave updated!");
	}
	
	public void addSalary()
	{
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		System.out.println("Enter amount of salary: ");
		int salary=scan.nextInt();
		for(Employee employee: employeeList)
		{
			if(employee.getId()==id)
			{
				employee.setSalary(salary+employee.getSalary());
			}
		}
		System.out.println("Salary added!");
	}
	
	public void calculateSalary()
	{
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		for(Employee employee: employeeList)
		{
			if(employee.getId()==id)
			{
				int temp1=employee.getSalary()/30;
				int temp2=30-employee.getLeaveCount();
				System.out.println(employee.getName()+"'s salary amount is: "+temp1*temp2);
			}
		}
	}
	
	public void leaveBalance()
	{
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		for(Employee employee: employeeList)
		{
			if(employee.getId()==id)
			{
				System.out.println("Leave balance of "+employee.getName()+":"+(18-employee.getLeaveCount()));
			}
		}
	}
	
	public void viewDesignation()
	{
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		for(Employee employee: employeeList)
		{
			if(employee.getId()==id)
			{
				System.out.println("Designation of "+employee.getName()+":"+employee.getDeignation());
			}
		}
	}
}
