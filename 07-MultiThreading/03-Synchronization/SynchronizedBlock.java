class RunnableDemo implements Runnable{
    private int counter=100;
    public void getCounter()
     {
        synchronized(this)
        {
       for(int i=0;i<1000;i++)
       {
        this.counter++;
       }
        }
       System.out.println(counter);
    }
    @Override
    public void run()
    {
     getCounter();
    }
}

public class SynchronizedBlock{
         public static void main(String[]args)
        {
            RunnableDemo r1= new RunnableDemo();
            Thread t1=new Thread(r1);
            Thread t2=new Thread(r1);
            t1.start();
            t2.start();
         }
}
