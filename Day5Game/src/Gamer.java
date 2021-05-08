
public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthDay;
	private int identityNumber;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, int birthDay, int identityNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	
}