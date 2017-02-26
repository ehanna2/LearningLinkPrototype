
/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This class represents the a class a prerequisite 
 * courseID is the class that must be taken
 * grate is the minimum grade that must be achieved
 * 
 */

public class Prerequisite {
	
	private String courseID;
	private double grade;     //Represented as a double on a 4.0 scale
	
	//DEFAULT CONSTRUCTOR
	public Prerequisite() {
		
	}
	
	public Prerequisite(String courseID, double grade){
		this.courseID = courseID;
		this.grade = grade;
	}

	//GETTERS AND SETTERS
	public String getCourseID() {
		return courseID;
	}


	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	

}
