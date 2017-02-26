
/*
 * This is a driver class that can be used to create and test objects
 */
public class Driver {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Create a new student
		String firstname = "Eli";
		Student Eli = new Student();
		Eli.setFirstName("Eli");
		Eli.setLastName("Hanna");
		Eli.setEmail("ehanna2@asu.edu");
		
		System.out.println(Eli.getEmail());
		
		

	}

}
