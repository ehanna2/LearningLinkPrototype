/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents a list of courses a student is currently enrolled in.
 */
public class EnrolledCourse {

	private Course course;
	private int percentCompleted;
	private int[] moduleGrades;
	private int overallGrade;
	private boolean completed;
		
	public EnrolledCourse(Course course) {
		this.course = course;
		percentCompleted = 0;
		
	}
	
	private int calculatePercentComplete(){
		//TODO determine how to calculate
		return percentCompleted;
	}
	
	public int getPercentCompleted(){
		return percentCompleted;
	}
	
	public int[] getModuleGrades(){
	
		return moduleGrades;
	}
	
	private double calculateOverallGrade(){
		//TODO Add calculation
		return overallGrade;
	}
	
	public double getOverallGrade(){
		return overallGrade;
	}
}
