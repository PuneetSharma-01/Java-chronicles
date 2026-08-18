public class CreatingThread  extends Thread {
   @Override
    public void run()
    {
      System.out.println("Thread is Running");
    }
    public static void main(String[]args)
    {
        CreatingThread c=new CreatingThread();
        c.start();
    }
    
}
