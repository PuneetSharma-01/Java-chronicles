class MyThread extends Thread {
    @Override
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("Singing");
        }
    }
}
public class Threadjoin {
    public static void main(String[]args)
    {
     MyThread t1=new MyThread();
     MyThread t2=new MyThread();
     t1.start();
     try{
     t1.join();
     }
     catch(InterruptedException ie)
     {
        System.out.println("Thread was Interrupted");
     }
     t2.start();
     
    }
}

