package week3.day1;

public class StudentDetails {
	public void getStudentDetails() { 
}
		public void getStudentDetails( int id) {
			System.out.println("Details of " +id);
	}
	
		public void getStudentDetails( int id, int age) {
	}
	
	
		public void getStudentDetails( int id , String name) {
			System.out.println("Details of "+id+" - "+name);
	}
	public void getStudentDetails( String name , int id) {
		
	}
	public static void main(String[] args) {
StudentDetails student = new StudentDetails();
student.getStudentDetails(100);
student.getStudentDetails(100, "Shyam");
	}

}
