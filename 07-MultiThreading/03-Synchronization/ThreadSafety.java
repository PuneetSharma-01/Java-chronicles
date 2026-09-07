class MyRunnable implements Runnable 
{
    private int counter=0;
    public void showCounter()
    {
        synchronized (this) {
        for(int i=1;i<=10000;i++)
        {
          counter++;
        }
    }
        System.out.println(counter);
    }
    @Override
    public void run()
    {
     showCounter();
    }
}
public class ThreadSafety 
{
    public static void main(String[] args) {
        MyRunnable r= new MyRunnable();
        Thread t1= new Thread(r);
        Thread t2= new Thread(r);
         t1.start();
         t2.start();
    }
    
}
