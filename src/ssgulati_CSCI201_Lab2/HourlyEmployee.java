package ssgulati_CSCI201_Lab2;

public class HourlyEmployee extends Employee{
	private double hourlyRate;
	private double numberHoursPerWeek;
	
	public HourlyEmployee(String first, String last, String birth, int ID, String title, String comp, double rate, double numHours) 
	{
		super(first, last, birth, ID, title, comp);
		hourlyRate = rate;
		numberHoursPerWeek = numHours;
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	public double getNumberHoursPerWeek()
	{
		return numberHoursPerWeek;
	}
	
	//calculate annual salary and implement abstract method 
	public double getAnnualSalary()
	{
		return hourlyRate * numberHoursPerWeek * 52;
	}

}
