package ssgulati_CSCI201_Lab2;

public class Person {
	private String firstName;
	private String lastName;
	private String birthdate;
	

	public Person(String first, String last, String birth) {
		firstName = first;
		lastName = last;
		birthdate = birth;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getBirthdate()
	{
		return birthdate;
	}
}
