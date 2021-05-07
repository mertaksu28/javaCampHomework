
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setUserName("mertaksu28");
		user.setEmail("@mert");
		user.setPassword("123");
		
		Instructor instructor =new Instructor("mert","aksu",1000);
		instructor.setId(1);
		instructor.setPassword("987");
		instructor.setEmail("@engin");
		instructor.setSalary(5000);
		instructor.setUserName("enginnn");
		
		
		Student student = new Student();
		student.setId(2);
		student.setUserName("Enginn");
		student.setFirstName("Mehmet");
		student.setLastName("mert");
		student.setPassword("@mehmet");
		student.setCourse("C#");
		
		StudentManager studentManager = new StudentManager();
		
		UserManager deneme = new StudentManager();
		
		deneme.addUser(student);
		deneme.addUser(user);

		
		
//		InstructorManager instructorManager = new InstructorManager();
//		
//		instructorManager.addToInstructor(instructor);
//		instructorManager.addUser(user);
//		
	

	}

}
