package basicofjava;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shruti",nstr=" ";
		char ch;
		
		System.out.println("Original word:Shruti");
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
        System.out.println("Reversed word:"+nstr);
        
        //string builder
        System.out.println("String Builder:");
        StringBuilder s1=new StringBuilder(str);
        StringBuilder rev1=s1.reverse();
        System.out.println(rev1);
        
        System.out.println("toCharArray:");
        char [] arr=str.toCharArray();
        
        for(int i=arr.length-1;i>=0;i--) {
        	System.out.print(arr[i]);
        }
	}

}
