/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a list of courses a student has completed
 * 
 */
public class CompletedCourse {

	private double grade;
	private Course course;
	
	public CompletedCourse(Course course, double grade) {
		this.course = course;
		this.grade = grade;
	}
	
	public double getGrade(){
		return grade;
	}
	
	public Course getCoures() {
		return course;
	}

}
