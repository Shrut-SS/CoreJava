package oops;

public class StudEncapsulation {
	
	public static void main(String[] args) {
		//using getter setter method
//		Student s=new Student();
//		s.setRno(12);
//		s.setName("Shruti");
//		s.setCity("Mumbai");
//		System.out.println("Student roll no: "+s.getRno());
//		System.out.println("Student name:"+s.getName());
//		System.out.println("City:"+s.getCity());
		
		
		//using parameterized constructor
		Student s=new Student(34,"Shruti","Badlapur");
		System.out.println("Student roll no: "+s.getRno());
		System.out.println("Student name:"+s.getName());
		System.out.println("City:"+s.getCity());
		
		s.setRno(45);
		System.out.println("Student roll no: "+s.getRno());
		
		
		
		
		
	}

}
