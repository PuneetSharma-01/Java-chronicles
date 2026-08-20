class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("My name is Albert");
    }
}

public class CreatingThreadUsingRunnable {
    public static void main(String[]args)
    {
        MyRunnable r= new MyRunnable();
        Thread t=new Thread(r);
        t.start();
    }

}
