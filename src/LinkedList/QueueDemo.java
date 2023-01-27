package LinkedList;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(20);
		q.add(23);
		q.add(30);
		System.out.println("Peek method:"+q.peek());
		System.out.println(q.element());
		System.out.println("Poll method:"+q.poll());
		System.out.println(q.peek());
		System.out.println("Poll method:"+q.poll());
		System.out.println("Queu trersing using iterator:");
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(q.peek());
		System.out.println("Element method:"+q.element());
		
		
		

	}

}
