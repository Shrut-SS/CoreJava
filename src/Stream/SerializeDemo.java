package Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.name = "Rutik";
		e.address = "Karjat";
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in employee.txt");
			
		}catch(IOException i) {
			i.printStackTrace();
		}

	}

}
