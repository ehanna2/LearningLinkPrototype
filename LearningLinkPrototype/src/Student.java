/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a student. It is a child of @User
 */
public class Student extends User {

	private Course[] EnrolledCourse;
	private Course[] CompletedCourse;
	private double GPA;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//Custom constructor to demo prototype. We don't care about the other attributes for this use case
	public Student(String firstName, String lastName, String email, double GPA){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.GPA = GPA;
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
