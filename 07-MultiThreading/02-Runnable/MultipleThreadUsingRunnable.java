class MyRunnable implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<3;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
public class MultipleThreadUsingRunnable {
    public static void main(String[] args) {
        MyRunnable r1=new MyRunnable();
        MyRunnable r2=new MyRunnable();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

        for(int i=1;i<3;i++)
        {
            System.out.println("Main Thread");
        }
    }
    
}
