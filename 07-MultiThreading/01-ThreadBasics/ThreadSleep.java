public class ThreadSleep extends Thread {
    @Override
    public void run()
    { 
        for(int i=1;i<4;i++){
            try{Thread.sleep(2000);
            System.out.println("He is driving a car");
            }
        catch(InterruptedException ie){
        }
    }
 }
    public static void main(String[]args)
    {
     ThreadSleep ts=new ThreadSleep();
     ts.start();

    }
}
