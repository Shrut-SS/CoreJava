package LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileHandlingEx1
{ 
public static void main(String[] args) throws IOException
{ 
FileReader fReader = new FileReader("FileExample.txt");
BufferedReader bReader = new BufferedReader(fReader);
int records;
while((records = bReader.read()) != -1) {
System.out.print((char)records);
} 
bReader.close();
fReader.close();
} }
