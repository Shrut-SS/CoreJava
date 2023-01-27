package basicofjava;
class Subject{
	
	static String subName="Java";
}
//	int javaMarks;    //instance variable 
//	int pythonMarks;
//}
public class Instancevariable {
	public void displayAge() {
		int age = 0;     //local variable
		age = age+10;
		System.out.println("Age="+age);
	}
	public static void main(String args[]) {
		
		Instancevariable instancevariable = new Instancevariable();
		instancevariable.displayAge();
		Subject s=new Subject();
//		s.javaMarks = 45;
//		s.pythonMarks = 44;
//		System.out.println("Java Marks:"+s.javaMarks);
//		System.out.println("Python marks:"+s.pythonMarks);
		System.out.println("Subject name:"+s.subName);
	}

}
