package multiheritance;

class bike{
	final int speedlimit=90;
	void run() {
		System.out.println(speedlimit);
		//speedlimit=400;
	}
}
public class finalvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new bike();
		obj.run();
		

	}

}
