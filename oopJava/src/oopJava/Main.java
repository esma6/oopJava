package oopJava;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setName("Esma");
		student1.setCouponCode("Ogr-25");
		
		Instructor instructor1=new Instructor();
		instructor1.setName("Engin");
		instructor1.setCourse("Java ");
		
		InsturctorManager instructorManager = new InsturctorManager();
		instructorManager.logIn(instructor1);
		instructorManager.add(instructor1);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.logIn(student1);
		studentManager.discount(student1);
		
		
			
	}
}
