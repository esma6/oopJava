package oopJava;

public class InsturctorManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+ " : E�itmen giri�i");
	}
	
	public void add(Instructor instructor) {
		System.out.println( "Yeni kurs a��ld� : "+ instructor.getCourse() );
	}

}
