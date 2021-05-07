
public class Instructor extends User {
	
	private String firstName;
	private String lastName;
	private double Salary;

	

	public Instructor( String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Salary = salary;
	}
	
	public Instructor() {
		
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}
	

}
