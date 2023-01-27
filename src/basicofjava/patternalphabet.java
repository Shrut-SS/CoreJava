package basicofjava;

public class patternalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet = 65;
        
//        System.out.println("** Printing the pattern... **");
//        for (int i = 0; i <= 5; i++)
//        {
//            for (int j = 0; j <= i; j++)
//            {
//                System.out.print((char) (alphabet + j) + " ");
//            }
//            System.out.println();
//        }
        int c=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c++;
				System.out.print(c);
			}
			System.out.println();
		}

	}
}


