/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a list of courses a student is currently enrolled in.
 */
public class EnrolledCourse {

	private Course course;
	private int percentCompleted;
	private double overallGrade;
		
	public EnrolledCourse(Course course) {
		this.course = course;
		percentCompleted = 0;
		
	}
	
	public int getPercentCompleted() {
		return percentCompleted;
	}
	
	public double getOverallGrade() {
		return overallGrade;
	}

	public Course getCourse() {
		return course;
	}

}
