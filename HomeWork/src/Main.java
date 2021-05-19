
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C#+ANGULAR)","Engin Demiro�","�cretsiz");

		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA+REACT)","Engin Demiro�","�cretsiz");
		
		Course course3 = new Course(3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�","�cretsiz");
		
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
