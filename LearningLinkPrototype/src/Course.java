
public class Course {
	private String courseID;
	private String courseName;
	private String courseHomePage;
	private String courseOverview;
	//private Prerequisite prereq
	//private Teacher instructor;
	private String whoClassFor;
	private String briefSyllabus;
	private String courseDifficulty;
	private int  courseTotalHours;
	private double userRating;
	//modules
	//enrolledStudents
	
	
	
	//GETTERS AND SETTERS
	public String getCourseID(){
		return courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseHomePage() {
		return courseHomePage;
	}
	public void setCourseHomePage(String courseHomePage) {
		this.courseHomePage = courseHomePage;
	}
	public String getCourseOverview() {
		return courseOverview;
	}
	public void setCourseOverview(String courseOverview) {
		this.courseOverview = courseOverview;
	}
	public String getWhoClassFor() {
		return whoClassFor;
	}
	public void setWhoClassFor(String whoClassFor) {
		this.whoClassFor = whoClassFor;
	}
	public String getBriefSyllabus() {
		return briefSyllabus;
	}
	public void setBriefSyllabus(String briefSyllabus) {
		this.briefSyllabus = briefSyllabus;
	}
	public String getCourseDifficulty() {
		return courseDifficulty;
	}
	public void setCourseDifficulty(String courseDifficulty) {
		this.courseDifficulty = courseDifficulty;
	}
	public int getCourseTotalHours() {
		return courseTotalHours;
	}
	public void setCourseTotalHours(int courseTotalHours) {
		this.courseTotalHours = courseTotalHours;
	}
	public double getUserRating() {
		return userRating;
	}
	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	
	
	
	
	
}
