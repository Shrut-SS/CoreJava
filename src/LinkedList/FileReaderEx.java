package LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
 
	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new FileReader("C:Test.txt"));
	System.out.println("No. of characters");
	while(br.ready()) {
		
	
	System.out.print((char)br.read());
	}
	}

}