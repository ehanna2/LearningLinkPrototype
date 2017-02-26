
public class Course {
	private String courseID;
	private String courseName;
	private String courseHomePage; //This is a URL to the courses homepage
	private String courseOverview;
	private Prerequisite prereq;
	private Teacher instructor;
	private String whoClassFor;
	private String briefSyllabus;
	private String courseDifficulty;
	private int  courseTotalHours;
	private double userRating;
	private String subject; //This describes the type of course ex: math, science, language...
	//modules
	//enrolledStudents
	
	//DEFAULT CONSTRUCTOR
	public Course(){
		
	}

	//GETTERS AND SETTERS

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
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

	public Prerequisite getPrereq() {
		return prereq;
	}

	public void setPrereq(Prerequisite prereq) {
		this.prereq = prereq;
	}

	public Teacher getInstructor() {
		return instructor;
	}

	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
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
	
	public String getSubject(){
		return subject;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	
	
	
}
