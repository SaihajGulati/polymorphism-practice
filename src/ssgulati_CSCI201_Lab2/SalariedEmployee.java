package ssgulati_CSCI201_Lab2;

public class SalariedEmployee extends Employee{
	private double annualSalary;
	
	public SalariedEmployee(String first, String last, String birth, int ID, String title, String comp, double salary) 
	{
		super(first, last, birth, ID, title, comp);
		annualSalary = salary;
	}
	
	public double getAnnualSalary()
	{
		return annualSalary;
	}
}
