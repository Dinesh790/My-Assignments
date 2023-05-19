package week3.day1assignment4;

public class Student {
	/*    Class: Students
    Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
	public void getStudentInfo(int id) {
	System.out.println("Id: "+id);	
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Id: "+id+", Name: "+name);
	}
	public void getStudentInfo(String email,Long PhoneNo) {
		System.out.println("Email: "+email+", Phone no: "+PhoneNo);
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.getStudentInfo(2345);
		stud.getStudentInfo(1234, "dinesh");
		stud.getStudentInfo("dineshmani@gmail.com", 9868685672l);
	}

}
