package Arraylist;
import java.util.ArrayList;
import java.util.Comparator;
public class ArrayListEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(8);
		
		System.out.println(list);
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		list.sort(Comparator.naturalOrder());
		System.out.println(list);

	}

}
