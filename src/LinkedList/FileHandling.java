package LinkedList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileHandling {

	public static void main(String[] args) {
	try {
	FileInputStream file = new FileInputStream("FileExample.txt");
	BufferedReader reader = new BufferedReader(new InputStreamReader(file));
	String line;
	while((line = reader.readLine()) != null){
	System.out.println(line);
	} }
	catch (IOException e) {
	e.printStackTrace();
	} } }
