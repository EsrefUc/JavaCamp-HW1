
public class Course {

	
	public Course() {
		System.out.println("Yaz�l�m Geli�tirici Yeti�tirme Kamp�");
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
	
