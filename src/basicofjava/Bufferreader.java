package basicofjava;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Bufferreader {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name:");
		String name = br.readLine();
		System.out.println("Enter the value of a and b: ");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
		System.out.println("My name is :"+name);
		System.out.println("Sum:"+(a+b));
		
	}

}
