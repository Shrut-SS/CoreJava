package pack2;

	class Student{
		int sid=10;
		void display() {
			System.out.println("Rollno:"+sid);
		}
	}
	class EngineerStud extends Student{
		String spec="Computer Eng";
		void displaySpe() {
			System.out.println(spec);
		}
	}
	
	public class inheritance {
		public static void main(String args[]){
			EngineerStud e=new EngineerStud();
			e.display();
			e.displaySpe();
		}

}
