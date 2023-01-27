package Arraylist;
import java.util.ArrayList;
public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(8);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Get method:"+list.get(2));
		list.remove(2);
		System.out.println(list.isEmpty());
		

	}

}
