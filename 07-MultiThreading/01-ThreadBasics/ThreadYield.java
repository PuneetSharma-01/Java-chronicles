class MyThread extends Thread{
    @Override
    public void run()
        {
          for(int i=1;i<4;i++)
          {
            Thread.yield();
            System.out.println("AUDI");
          }
        }
}
public class ThreadYield {
    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();
        for(int i=1;i<4;i++){
        System.out.println("BMW");
        }
    }
    
}
