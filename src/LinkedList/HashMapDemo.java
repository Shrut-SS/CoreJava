package LinkedList;

import java.util.HashMap;
import java.util.TreeMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
//		hm.put(1, "JSP");
		hm.put(5,  "JSF");
		hm.put(6, "JSscript");
		hm.put(3,"HTML");
		
		hm.putIfAbsent(4, "Java");
//		System.out.println("HashMap:"+hm);
		System.out.println("TreeMap:"+hm);
		hm.putIfAbsent(2, "Python");
//		System.out.println("Update HashMap:"+hm);
		System.out.println("Update TreeMap:"+hm.containsKey(1));
		

	}

}
