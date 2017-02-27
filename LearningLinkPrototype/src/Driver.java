import java.util.ArrayList;
import java.util.Scanner;

/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This is a driver class that can be used to create and test objects
 * This will be used to perform the demo for the final deliverable
 */
public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = "";

		
		//Create new test students
		Student Eli = new Student("Eli", "Hanna", "ehanna2@asu.edu", 4.0);
		Student Kendra = new Student("Kendra", "Neil", "kneail@asu.edu", 4.0);
		Student Jeremy = new Student("Jeremy", "Pasimio", "jpasimio@asu.edu", 4.0);
		Student Robert = new Student("Robert", "Beerman", "rbeerman@asu.edu", 4.0);
		Student Mary = new Student("Mary", "Brown", "mbrown@gmail.com", 4.0);
		
		
		//Create a test Instructors
		Instructor Sally = new Instructor("Sally", "Doe", "sdoe@asu.edu", "Dr. Doe has a PhD in Math.");
		
		
		//Create a Prerequisite
		Course CalculusI = new Course();
		Prerequisite CalcI = new Prerequisite(CalculusI, 2.0);
		CalculusI.setCourseName("Calculus For Engineer I");
		
		
		//Create a Course
		Course CalculusII = new Course();
		CalculusII.setCourseID("MAT266");
		CalculusII.setCourseName("Calculus for Engineers II");
		CalculusII.setCourseHomePage("www.learninglink.com/Calc2");
		CalculusII.setSubject("Mathematics");
		CalculusII.setCourseOverview("Methods of integration, applications of calculus, elements of analytic geometry, improper integrals");
		CalculusII.setPrereq(CalcI);
		CalculusII.setInstructor(Sally);
		CalculusII.setWhoClassFor("Students who want to learn integrals!");
		CalculusII.setBriefSyllabus("This is the second class in our Calculus for Engineers series.");
		CalculusII.setCourseDifficulty("Hard");
		CalculusII.setCourseTotalHours(200);
		CalculusII.setUserRating(4.5);
		String[] modules = {"Integration", "Taylor Series", "Parametric Curves", "Polar Equations"};
		CalculusII.setModules(modules);
		CalculusII.setEnrollmentLimit(50);
		
		//ASSIGN Instructor SALLY TO TEACH CALCULUS II
		Sally.addCourseTeaching(CalculusII);
		
		//Assign Calculus I as Completed Class for Mary
		Mary.addToCompletedCourseList(CalculusI, 4.0);
		
		//Display Course Page for Calculus II
		System.out.println("Calculus II\n\nCourse Information\n\nCourse ID: " + CalculusII.getCourseID() 
				+ "\nCourse Name: " + CalculusII.getCourseName() + "\nCourse Homepage: " 
				+ CalculusII.getCourseHomePage() + "\nCourse Subject: " + CalculusII.getSubject() 
				+ "\nCourse Overview: " + CalculusII.getCourseOverview() + "\nPrerequisites: " 
				+ CalculusII.printPrereq(CalcI) + "\nInstructor: " + CalculusII.getInstructorName() 
				+ "\nWho the Course is For: " + CalculusII.getWhoClassFor() + "\nBrief Syllabus: " 
				+ CalculusII.getBriefSyllabus() + "\nDifficulty: " + CalculusII.getCourseDifficulty()
				+ "\nTotal Hours to Complete: " + CalculusII.getCourseTotalHours() + "\nUser Rating: "
				+ CalculusII.getUserRating() + "\nModules: " + CalculusII.printModules() 
				+ "\nMax Enrollment: " + CalculusII.getEnrollmentLimit() + "\nStudents Enrolled: " 
				+ CalculusII.getStudentNames());
		
		System.out.println("\n" + Mary.firstName + " " + Mary.lastName + "'s Course List:\n" 
				+ Mary.printEnrolledCourses());
	
		//Register test students to course
		System.out.println("\nPress Enter to Register.");
		input = scan.nextLine();
		
		if(prereqCheck(Mary, CalculusII) && CalculusII.spaceInClass()) {
			
			// Add class to Mary's Enrolled Classes List
			EnrolledCourse MaryBrownCalcII = Mary.enroll(CalculusII);
			Mary.addEnrolledCourse(MaryBrownCalcII);
			System.out.println("Congratulations! Course Added.");
			System.out.println("\n" + Mary.firstName + " " + Mary.lastName + "'s Course List:\n" 
					+ Mary.printEnrolledCourses());
			
			//Add Mary to Class Roster
			CalculusII.addEnrolledStudent(Mary);
			System.out.println("Calculus II\n\nCourse Information\n\nCourse ID: " + CalculusII.getCourseID() 
			+ "\nCourse Name: " + CalculusII.getCourseName() + "\nCourse Homepage: " 
			+ CalculusII.getCourseHomePage() + "\nCourse Subject: " + CalculusII.getSubject() 
			+ "\nCourse Overview: " + CalculusII.getCourseOverview() + "\nPrerequisites: " 
			+ CalculusII.printPrereq(CalcI) + "\nInstructor: " + CalculusII.getInstructorName() 
			+ "\nWho the Course is For: " + CalculusII.getWhoClassFor() + "\nBrief Syllabus: " 
			+ CalculusII.getBriefSyllabus() + "\nDifficulty: " + CalculusII.getCourseDifficulty()
			+ "\nTotal Hours to Complete: " + CalculusII.getCourseTotalHours() + "\nUser Rating: "
			+ CalculusII.getUserRating() + "\nModules: " + CalculusII.printModules() 
			+ "\nMax Enrollment: " + CalculusII.getEnrollmentLimit() + "\nStudents Enrolled: " 
			+ CalculusII.getStudentNames());
			
			
		} else if(prereqCheck(Mary, CalculusII) ) {
			System.out.println("Registration Unsuccessful. Prerequisites Not Met.");
		} else {
			System.out.println("Registration Unsuccessful. Class Full.");
		}	
	}
	
	public static boolean prereqCheck(Student student, Course course) {
		Prerequisite coursePrereq = course.getPrereq();
		ArrayList<CompletedCourse> complete = student.getCompletedCourseList();
		for(int i = 0; i < complete.size(); i++) {
			Course temp = complete.get(i).getCourse();
			Course prereq = coursePrereq.getCourse();
			if(temp.equals(prereq))
				return true;
		}
		return false;
	}
}
