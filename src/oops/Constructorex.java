package oops;

public class Constructorex {
   String name;
   String city;
   int rollno;
   String course;
//   public Constructorex() {
   	private Constructorex() {
	   System.out.println("Default.");
	   name="Shruti";
   }
   	Constructorex(String c){
   		city = c;
   		System.out.println("I stay at "+city);
   	}
   	Constructorex(int r,String cr){
   		rollno = r;
   		course = cr;
   		
   		System.out.println("Rollno and course "+rollno+" "+course);
   	}
  	Constructorex(Constructorex a){
  		System.out.println("Copy Constructor:");
   		rollno = a.rollno;
   		course = a.course;
   		System.out.println("Rollno and course "+a.rollno+" "+a.course);
   	
  	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorex c = new Constructorex();
		System.out.println("My name is " +c.name);
		Constructorex c1 = new Constructorex("Badlapur");
		Constructorex c3 = new Constructorex(34,"Computer");
		Constructorex c4 = new Constructorex(c3);
		

	}

}
