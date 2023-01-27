package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NewFileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File newFile = new File("List Of Courses.txt");
		FileInputStream fis = new FileInputStream(newFile);
		System.out.println("File Content");
		int i = fis.read();
		System.out.println((char)i);
		while(i!=-1) {
			System.out.println((char)i);
			i = fis.read();
		}
		fis.close();

	}

}
