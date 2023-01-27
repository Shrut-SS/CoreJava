package collectionDemo;

import java.util.Stack;

public class StackRev {
	
	public static String revStr(String s) {
		if(s.equals("")|| s==null) {
			return s;
		}
		Stack<Character> c=new Stack<>();
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			c.push(a[i]);
		}
		int i=0;
		while(!c.isEmpty()) {
			a[i++]=c.pop();
		}
		return String.copyValueOf(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Welcome Java";
//        System.out.println("Reverse String:"+StackRev.revStr(s));
		 System.out.println(revStr(s));
		 String str=revStr(s);
		 System.out.println(str);
	}

}
