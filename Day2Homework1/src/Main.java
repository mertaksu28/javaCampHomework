
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Java", "Engin Kral", 92);

		Course course2 = new Course();
		course2.id = 2;
		course2.Name = "C#";
		course2.Teacher = "Engin Reis";
		course2.Completed = 100;

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println("Kursun Eğitmeni : " + course.Teacher);
		}

		System.out.println(courses.length);

		CourseManager courseManager = new CourseManager();

		courseManager.JoinTheCourse(course1);

	}

}
