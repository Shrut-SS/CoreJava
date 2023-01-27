package LinkedList;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		
		int element = 4;//Search element
		int ans = -1;
		for(int i=0;i<l1.size();i++) {
			int l1Element = l1.get(i);
			
			if(l1Element == element) {
				ans = i;
				break;
			}
		}
		if(ans==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found in Linked List at "+ans+" Position");
		}
	}

}
