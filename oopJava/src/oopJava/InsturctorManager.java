package oopJava;

public class InsturctorManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+ " : Eðitmen giriþi");
	}
	
	public void add(Instructor instructor) {
		System.out.println( "Yeni kurs açýldý : "+ instructor.getCourse() );
	}

}
