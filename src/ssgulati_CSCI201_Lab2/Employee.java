package ssgulati_CSCI201_Lab2;


//needs abstract keyword at top since contains abstract method
public abstract class Employee extends Person {
	private int employeeID;
	private String jobTitle;
	private String company;
	
	public Employee(String first, String last, String birth, int ID, String title, String comp) {
		super(first, last, birth);
		employeeID = ID;
		jobTitle = title;
		company = comp;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public abstract double getAnnualSalary();
}