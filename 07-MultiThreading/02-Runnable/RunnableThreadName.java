class MyRunnable implements Runnable
{
    @Override
    public void run()
        {
          System.out.println(Thread.currentThread().getName());
        }
}
public class RunnableThreadName {
    public static void main(String[]args)
    {
        MyRunnable r= new MyRunnable();
        Thread t= new Thread(r);
        t.setName("Puneet Sharma");
        t.start();
    } 
}
