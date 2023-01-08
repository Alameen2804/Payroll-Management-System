package Payroll;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String qualification;
	private Designation deignation;
	private String dateOfBirth;
	private Address adress;
	private int salary;
	private int leaveCount;
	private int experience;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Designation getDeignation() {
		return deignation;
	}
	public void setDeignation(Designation deignation) {
		this.deignation = deignation;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public Employee(int id, String name, int age, String qualification,
			Designation deignation, String dateOfBirth, Address adress,
			int salary, int leaveCount, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.deignation = deignation;
		this.dateOfBirth = dateOfBirth;
		this.adress = adress;
		this.salary = salary;
		this.leaveCount = leaveCount;
		this.experience = experience;
	}
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age
				+ ", qualification=" + qualification + ", deignation="
				+ deignation + ", dateOfBirth=" + dateOfBirth + ", adress="
				+ adress + ", salary=" + salary + ", leaveCount=" + leaveCount
				+ ", experience=" + experience + "]\n";
	}
}
