package Stream;

class ATMtransaction
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 4; i++)
        {
            AccountHolder t = new AccountHolder(); // LINE A
            t.setName("Person" + i);
            t.start();
        }
    }
}
class ATMCenter
{
   static synchronized void userAction()throws InterruptedException
    {
        System.out.println(Thread.currentThread().getName() + " entered"); // LINE D
        System.out.println("Performed Transaction");
        //try
       //{
            Thread.sleep(400);
       // }
      //  catch (Exception e)
        //{
            //System.out.println("Thread Interrupted");
        //}
        System.out.println(Thread.currentThread().getName() + " transaction complete");
        System.out.println(Thread.currentThread().getName() + " leaving......."); // LINE E
        System.out.println("-----------------------------------------------");
    }
}

class AccountHolder extends Thread
{

  // ATMCenter s = new ATMCenter(); // LINE F

    @Override
    public void run()
    {
       // s.userAction(); // LINE G
        try {
			ATMCenter.userAction();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
