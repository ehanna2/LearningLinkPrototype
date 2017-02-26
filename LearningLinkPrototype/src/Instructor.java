import java.util.ArrayList;

/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a Teacher. It is a child of @User
 */
public class Instructor extends User{

	private ArrayList<Course> coursesTeaching = new ArrayList<Course>();
	private String bio;
	
	public Instructor() {
		// TODO Auto-generated constructor stub
	}
	
	//Custom constructor to demo prototype. We don't care about the other attributes for this use case
	public Instructor(String firstName, String lastName, String email, String bio){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bio = bio;
	}

	public ArrayList<Course> getCoursesTeaching() {
		return coursesTeaching;
	}

	public void addCourseTeaching(Course course) {
		coursesTeaching.add(course);
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
