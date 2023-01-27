package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("Text.txt");
		FileOutputStream fs = new FileOutputStream("TestCopy.txt");
		int i=0;
		while((i=fi.read())!=-1) {
			fs.write((char)i);
		}
		fi.close();
		System.out.println("Content copied successfully");
	}

}
