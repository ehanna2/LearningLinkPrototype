
public class Student extends User {

	private Course[] EnrolledCourse;
	private Course[] CompletedCourse;
	private double GPA;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	//GETTERS AND SETTERS;
	public Course[] getEnrolledCourse() {
		return EnrolledCourse;
	}

	public void setEnrolledCourse(Course[] enrolledCourse) {
		EnrolledCourse = enrolledCourse;
	}

	public Course[] getCompletedCourse() {
		return CompletedCourse;
	}

	public void setCompletedCourse(Course[] completedCourse) {
		CompletedCourse = completedCourse;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
