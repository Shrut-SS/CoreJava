package LinkedList;

import java.util.HashSet;
import java.util.TreeSet;

public interface Set {
	public static void main (String args[]) {
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(5);
	
	hs.add(10);
	hs.add(2);
	System.out.println("Elements in hashset:"+hs);
//	HashSet<String> hs1=new HashSet<String>();
	TreeSet<String> hs1=new TreeSet<String>();
	
	hs1.add("Shruti");
	hs1.add("divya");
	hs1.add("Akanksha");
	hs1.add("Akanksha");
//	System.out.println("Elements in Hashset String:"+hs1);
	System.out.println("Elements in Treeset String:"+hs1);

}
}
