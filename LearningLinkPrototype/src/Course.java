import java.util.ArrayList;

/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This represents a course a student can take on LearningLink
 */

public class Course {
	private String courseID;       //Course Call number ex: MAT266, SER315
	private String courseName;     //Longform name of course ex: Calculus II, Software Design
	private String courseHomePage; //This is a URL to the courses homepage
	private String courseOverview; //Brief description of course
	private Prerequisite prereq;  
	private Instructor instructor;
	private String whoClassFor;    //The intended audience
	private String briefSyllabus;
	private String courseDifficulty;
	private int  courseTotalHours; 
	private double userRating;
	private String subject; //This describes the type of course ex: math, science, language...
	private String[] modules;       
	private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
	private int enrollmentLimit;
	
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
	
	public String printPrereq(Prerequisite prereq) {
		Course temp = prereq.getCourse();
		return temp.courseName + " with at least a " + prereq.getGrade(); 
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public String getInstructorName() {
		return instructor.firstName + " " + instructor.lastName;
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
	
	public String[] getModules(){
		return modules;
	}
	
	public void setModules(String[] modules2){
		this.modules = modules2;
	}
	
	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void addEnrolledStudent(Student student) {
		enrolledStudents.add(student);
	}
		
	public int getNumStudentsEnrolled() {
		try {
			return enrolledStudents.size();
		} catch(Exception e) {
			return 0;
		}
	}
	
	public void setEnrollmentLimit(int enrollmentLimit) {
		this.enrollmentLimit = enrollmentLimit;
	}
	
	public int getEnrollmentLimit() {
		return enrollmentLimit;
	}
	
	/*
	 *returns a string representation of the modules
	 *that make up a course 
	 */
	public String printModules() {
		String list = modules[0];
		for(int i = 1; i < modules.length; i++) {
			list = list + ", " + modules[i];
					
		}
		return list;
	}
	
	/*
	 * Checks to see if there is room in the course to add new students.
	 * Returns TRUE if a student can be added.
	 * Returns FALSE if a student cannot be added.
	 */
	public boolean spaceInClass() {
		if(getNumStudentsEnrolled() < enrollmentLimit)
			return true;
		return false;
	}
	
	
	/*
	 * Returns a string representation of the students enrolled in the course.
	 * If no students are enrolled it returns the string "none".
	 */
	public String getStudentNames() {
		try {
			Student temp = enrolledStudents.get(0);
			String student = temp.firstName + " " + temp.lastName;
			String list = student;
			for(int i = 1; i < enrolledStudents.size(); i++) {
				temp = enrolledStudents.get(i);
				student = temp.firstName + " " + temp.lastName;
				list = list + ", " + student;
			}
		return list;
		} catch(Exception e) {
			return "none";
		}
	}
}
