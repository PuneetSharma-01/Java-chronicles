class MyRunnable implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            Thread.yield();
                System.out.println("Virat Kohli");
            }
        }
    }

public class RunnableThreadUsingYield {
    public static void main(String[] args) {
        MyRunnable m= new MyRunnable();
        Thread t=new Thread(m);
        t.start();
        for(int i=0;i<5;i++) {
            System.out.println("MS Dhoni");
        }
    }
    
}
