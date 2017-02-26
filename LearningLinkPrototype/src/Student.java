import java.util.ArrayList;

/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a student. It is a child of @User
 */
public class Student extends User {

	private EnrolledCourse enrolledCourse;
	private CompletedCourse completeCourse;
	private ArrayList<CompletedCourse> completedCourses = new ArrayList<CompletedCourse>();
	private ArrayList<EnrolledCourse> enrolledCourses = new ArrayList<EnrolledCourse>();
	private double GPA;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//Custom constructor to demo prototype. We don't care about the other attributes for this use case
	public Student(String firstName, String lastName, String email, double GPA, String userID, String password){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.GPA = GPA;
		this.userID = userID;
		this.password = password;
	}
	
	
	
	//Add, Drop, Return
	public void addEnrolledClass(EnrolledCourse course) {
		enrolledCourses.add(course);
	}

	public void dropEnrolledCourse(EnrolledCourse course) {
		enrolledCourses.remove(course);
	}
	
	public ArrayList<EnrolledCourse> getEnrolledCourses() {
		return enrolledCourses;
	}
	
	public boolean isEnrolled(Course courseName) {
		for(EnrolledCourse enrolledCourse : enrolledCourses) {
			if(enrolledCourse.)
		}
		return false;
	}

	public Course getCompletedCourse() {
		return CompletedCourse;
	}

	public void setCompletedCourse(Course completedCourse, double grade) {
		
	}

	//GETTERS AND SETTERS;
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
