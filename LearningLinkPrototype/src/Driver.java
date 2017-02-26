import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * This is a driver class that can be used to create and test objects
 * This will be used to perform the demo for the final deliverable
 */
public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String username, password;

		
		//Create new test students
		Student Eli = new Student("Eli", "Hanna", "ehanna2@asu.edu", 4.0, "ehanna", "password");
		Student Kendra = new Student("Kendra", "Neil", "kneail@asu.edu", 4.0, "kneil", "password");
		Student Jeremy = new Student("Jeremy", "Pasimio", "jpasimio@asu.edu", 4.0, "jpasimio", "password");
		Student Robert = new Student("Robert", "Beerman", "rbeerman@asu.edu", 4.0, "rbeerman", "password");
		Student Mary = new Student("Mary", "Brown", "mbrown@gmail.com", 4.0, "mbrown", "password");
		
		
		//Create a test Teachers
		Teacher Sally = new Teacher("Sally", "Doe", "sdoe@asu.edu", "Dr. Doe has a PhD in Math.");
		Teacher Mark = new Teacher("Mark", "Smith", "msmith@asu.edu", "Dr. Smith has a PhD in Computer Science.");
		
		
		//Create a Prerequisite
		
		Prerequisite CalculusI = new Prerequisite("MAT265", 2.0);
		Mary.setCompletedCourse(CalculusI, 4.0);
		
		
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
		 JFrame frame = new JFrame("Calculus II");
		 frame.setVisible(true);
		 frame.setSize(500,200);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 JPanel panel = new JPanel();
		 frame.add(panel);
		 JButton button = new JButton("Register");
		 panel.add(button);
		
		
		//TODO print output to show how the prototype works
		System.out.println("Welcome to LearningLink. Please input your username and password.");
		while(!Mary.isLoginStatus()) {
			System.out.print("Username: ");
			username = scan.nextLine();
			System.out.print("Password: ");
			password = scan.nextLine();
			if(!Mary.validate(username, password))
				System.out.println("Invalid User Credentials, Please Try Again.");
		}
		System.out.println("Welcome Mary");
		

	}

}
