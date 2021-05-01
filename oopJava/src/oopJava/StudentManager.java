package oopJava;

public class StudentManager extends UserManager {
	
	@Override
	public void logIn(User user) {
		System.out.println(user.getName()+ " Öðrenci giriþi");
	}
	public void discount(Student student) {
		System.out.println("Kupon kodu uygulandý : " +student.getCouponCode());
		
	}

}
