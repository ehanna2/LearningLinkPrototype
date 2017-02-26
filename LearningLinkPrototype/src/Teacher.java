/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a Teacher. It is a child of @User
 */
public class Teacher extends User{

	private Course[] coursesTeaching;
	private String bio;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	//Custom constructor to demo prototype. We don't care about the other attributes for this use case
	public Teacher(String firstName, String lastName, String email, String bio){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bio = bio;
	}

	public Course[] getCoursesTeaching() {
		return coursesTeaching;
	}

	public void setCoursesTeaching(Course[] coursesTeaching) {
		this.coursesTeaching = coursesTeaching;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
