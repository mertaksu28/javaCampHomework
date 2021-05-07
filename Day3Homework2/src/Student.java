
public class Student extends User {
	
	 private int studentId;
	   private String firstName;
	   private String lastName;
	   private String course;
	  


	    public Student(int studentId, String firstName, String lastName, String course) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}
	    
	    public Student() {
	    	
	    }


	  public int getStudentId() {
		return studentId;
	}

	  public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	  public String getCourse() {
		return course;
	}

	  public void setCourse(String course) {
		this.course = course;
	}


}
