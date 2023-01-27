package LinkedList;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(8);
		s.push(16);
		System.out.println("Stack is:"+s);
		s.pop();
		System.out.println("Popped stack:"+s);
		System.out.println("Element at top is "+s.peek());
		if(s.isEmpty()) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		

	}

}
