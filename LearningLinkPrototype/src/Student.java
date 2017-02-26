import java.util.ArrayList;

/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a student. It is a child of @User
 */
public class Student extends User {

	private EnrolledCourse enrolledCourse;
	private ArrayList<CompletedCourse> completedCourses = new ArrayList<CompletedCourse>();
	private ArrayList<EnrolledCourse> enrolledCourses = new ArrayList<EnrolledCourse>();
	private double GPA;
	
	//Custom constructor to demo prototype. We don't care about the other attributes for this use case
	public Student(String firstName, String lastName, String email, double GPA){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.GPA = GPA;
	}
	
	
	
	//Add, Drop, Return
	public EnrolledCourse enroll(Course course) {
		enrolledCourse = new EnrolledCourse(course);
		return enrolledCourse;
	}
	
	public void addEnrolledCourse(EnrolledCourse course) {
		enrolledCourses.add(course);
	}
	
	public ArrayList<EnrolledCourse> getEnrolledCourses() {
		return enrolledCourses;
	}
	
	public String printEnrolledCourses() {
		String list = "";
		if(enrolledCourses.size() == 0)
			return "none";
		for(int i = 0; i < enrolledCourses.size(); i++) {
			EnrolledCourse temp = enrolledCourses.get(i);
			Course course = temp.getCourse();
			String name = course.getCourseName();
			list = list + name + "\n";
		}
		return list;
	}
	

	public boolean isEnrolled(Course courseName) {
		for(EnrolledCourse enrolledCourse : enrolledCourses) {
			Course temp = enrolledCourse.getCourse();
			if(temp.equals(courseName))
				return true;
		}
		return false;
	}
	
	public void addToCompletedCourseList(Course course, double grade) {
		CompletedCourse temp = new CompletedCourse(course, grade);
		completedCourses.add(temp);
	}
	
	public ArrayList<CompletedCourse> getCompletedCourseList() {
		return completedCourses;
	}

}
