class MyRunnable implements Runnable{
    @Override
    public void run()
    {
     System.out.println("Deepak is boy");
    }
}

public class RunnableThreadUsingJoin
{
public static void main(String[]args) 
{
    MyRunnable m1=new MyRunnable();
    Thread t1=new Thread(m1);
    MyRunnable m2=new MyRunnable();
    Thread t2=new Thread(m2);
    t1.start();
     try{
      t1.join();
     }
     catch(InterruptedException ie)
     {
         System.out.println("join is interrupting");
     }
    t2.start();

    System.out.println("Raavi is a girl");
    }
}
