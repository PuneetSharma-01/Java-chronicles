class MyRunnable implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<=7;i++)
        {
            try{Thread.sleep(1000);
                System.out.println("Virat Kohli");
            }
            catch(InterruptedException ie)
            {
                System.out.println("sleep is interrupting");
            }
        }
    }
}
public class RunnableThreadUsingSleep {
    public static void main(String[] args) {
        MyRunnable m= new MyRunnable();
        Thread t=new Thread(m);
        t.start();
    }
    
}
