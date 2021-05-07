
public class StudentManager extends UserManager {
	

	public void addToStudent(Student student) {
		System.out.println("Öğrenci Eklendi : " + student.getFirstName());
	}

}
