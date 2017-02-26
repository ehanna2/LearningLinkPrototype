
/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents the a class a prerequisite 
 * courseID is the class that must be taken
 * grate is the minimum grade that must be achieved
 * 
 */

public class Prerequisite {
	
	private Course course;
	private double grade;     //Represented as a double on a 4.0 scale
	
	public Prerequisite(Course course, double grade){
		this.course = course;
		this.grade = grade;
	}

	//GETTERS AND SETTERS
	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	

}
