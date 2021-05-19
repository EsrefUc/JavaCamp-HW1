
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C#+ANGULAR)","Engin Demiroð","Ücretsiz");

		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA+REACT)","Engin Demiroð","Ücretsiz");
		
		Course course3 = new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð","Ücretsiz");
		
		Course[] courses = {course1,course2,course3};
		for(Course course : courses) {
			System.out.println(course.id);
			
			System.out.println(course.courseName);
			
			System.out.println(course.courseInstructor);
			
			System.out.println(course.coursePrise);
			
			System.out.println("------------");
			
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToStudents(course1);
		courseManager.addToStudents(course2);
		courseManager.addToStudents(course3);
			
	
	}

}
