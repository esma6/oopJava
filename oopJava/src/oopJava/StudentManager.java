package oopJava;

public class StudentManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+ " ��renci giri�i");
	}
	public void discount(Student student) {
		System.out.println("Kupon kodu uyguland� : " +student.getCouponCode());
		
	}

}
