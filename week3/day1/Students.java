package week3.day1;

public class Students {
	
	/*
	 * Description: Create multiple getStudentInfo() method by passing id argument
	 * alone, by id & name, by email & phoneNumber
	 * 
	 */
	public void getStudentInfo(int id) {
		System.out.println("From Students class - getStudentInfo when id is passed: " +id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("From Students class - getStudentInfo when id & name is passed: " +id +" "+name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("From Students class - getStudentInfo when email & phoneNumber is passed: " +email +" "+phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students stud = new Students();
		
		stud.getStudentInfo(80134);
		stud.getStudentInfo(80134, "Pradeep Kumar");
		
		stud.getStudentInfo("abcd@gmail.com", 9987654321l);
		
	}
	
	
	

}
