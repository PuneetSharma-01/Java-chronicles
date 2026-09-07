class Account implements Runnable{
     double Balance=2500.0;
     int withdrawAmount=2000;

public void doWithdraw()
{
    synchronized (this) {
  if(Balance>=withdrawAmount)
  {
    Balance= Balance - withdrawAmount;
    System.out.println("Withdraw Succesfull");
    System.out.println("Current Balance..."+Balance);
  }
  else{
    System.out.println("Error Account Balance");
  }
}
}

@Override
    public void run()
    {
    doWithdraw();
    }
}

public class BankAccountSynchronization {
    public static void main(String[]args)
    {
        Account a=new Account();
        Thread user1= new Thread(a);
        Thread user2=new Thread(a);
        user1.start();
        user2.start();

    }
    
}
