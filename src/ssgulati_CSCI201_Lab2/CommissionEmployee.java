package ssgulati_CSCI201_Lab2;

public class CommissionEmployee extends SalariedEmployee{
	
	private double salesTotal;
	private double commissionPercentage;
	
	public CommissionEmployee(String first, String last, String birth, int ID, String title, String comp, double salary, double sales, double percent) 
	{
		super(first, last, birth, ID, title, comp, salary);
		salesTotal = sales;
		commissionPercentage = percent;
	}
	
	//call super because need to add to it
	public double getAnnualSalary()
	{
		return super.getAnnualSalary() + commissionPercentage * salesTotal;
	}

}
