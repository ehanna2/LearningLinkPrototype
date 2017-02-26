/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This is a driver class that can be used to create and test objects
 * This will be used to perform the demo for the final deliverable
 */
public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create new test students
		Student Eli = new Student("Eli", "Hanna", "ehanna2@asu.edu", 4.0);
		Student Kendra = new Student("Kendra", "Neil", "kneail@asu.edu", 4.0);
		Student Jeremy = new Student("Jeremy", "Pasimo", "jpasimo@asu.edu", 4.0);
		Student Robert = new Student("Robert", "Beerman", "rbeerman@asu.edu", 4.0);
		
		
		//Create a test Teachers
		Teacher Sally = new Teacher("Sally", "Doe", "sdoe@asu.edu", "Dr. Doe has a PhD in Math.");
		Teacher Mark = new Teacher("Mark", "Smith", "msmith@asu.edu", "Dr. Smith has a PhD in Computer Science.");
		
		
		//Create a Prerequisite
		
		Prerequisite CalculusI = new Prerequisite("MAT265", 2.0);
		
		
		//Create a Course
		Course CalculusII = new Course();
		CalculusII.setCourseID("MAT266");
		CalculusII.setCourseName("Calculus for Engineers II");
		CalculusII.setCourseHomePage("www.learninglink.com/Calc2");
		CalculusII.setSubject("Mathematics");
		CalculusII.setCourseOverview("Methods of integration, applications of calculus, elements of analytic geometry, improper integrals");
		CalculusII.setPrereq(CalculusI);
		CalculusII.setInstructor(Sally);
		CalculusII.setWhoClassFor("Students who want to learn integrals!");
		CalculusII.setBriefSyllabus("This is the second class in our Calculus for Engineers series.");
		CalculusII.setCourseDifficulty("Hard");
		CalculusII.setCourseTotalHours(200);
		CalculusII.setUserRating(4.5);
		String[] modules = {"Integration", "Taylor Series", "Parametric Curves", "Polar Equations"};
		CalculusII.setModules(modules);
		Student[] enrolledStudents  = {}; //Start with no enrolled Students
		CalculusII.setEnrolledStudents(enrolledStudents);
		
		//ASSIGN TEACHER SALLY TO TEACH CALCULUS II
		Course[] SallysCourses = {CalculusII};
		Sally.setCoursesTeaching(SallysCourses); 
		
	
		//TODO Register test students to course
		
		
		//TODO print output to show how the prototype works
		

	}

}
