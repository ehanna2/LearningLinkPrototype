
public class Teacher extends User{

	private Course[] coursesTeaching;
	private String bio;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
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
