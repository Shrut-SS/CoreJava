package basicofjava;

import java.util.Arrays;

public class String_concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s2="hello";
		String s1="Shruti";
		String s3="how are you?";
		String s4=" ";
		System.out.println(s+" "+s1);
		System.out.println(s.concat(s3));
		System.out.println("Length:"+s3.length());
		System.out.println("Substring:"+s3.substring(4,12));
		System.out.println("UpperCase:"+s1.toUpperCase());
		System.out.println("To check null:"+s4.isEmpty());
        char[] arr=new char[6];
        s1.getChars(0,6,arr,0);
        System.out.println("GetChar"+Arrays.toString(arr));
        System.out.println("Comparison:"+s.compareTo(s2));
        System.out.println("Comparison:"+s2.compareTo(s));
        System.out.println("Equals:"+s.equals(s2));
        System.out.println("Equals:"+s.equalsIgnoreCase(s2));
        System.out.println("StartWith:"+s1.startsWith("he"));
        System.out.println("EndWith:"+s1.endsWith("i"));
        System.out.println("Replace:"+s1.replace("Shruti","Shreya"));
        System.out.println("Repeat:"+s1.repeat(5));
        System.out.println("CharAT:"+s3.charAt(0));
        System.out.println("Trimtrailing:"+s3.stripTrailing());
        System.out.println("Trimlead:"+s.stripLeading());
	}

}
