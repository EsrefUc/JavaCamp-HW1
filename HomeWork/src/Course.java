
public class Course {

	
	public Course() {
		System.out.println("Yazýlým Geliþtirici Yetiþtirme Kampý");
	}
	
	public Course(int id, String courseName,String courseInstructor,String coursePrise) {
		
		this.id = id;
		this.courseName=courseName;
		this.courseInstructor=courseInstructor;
		this.coursePrise=coursePrise;
	}
	
	
	    int id;
	    String courseName;	
	    String courseInstructor;
        String coursePrise;
}
	
