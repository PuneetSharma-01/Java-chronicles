public class ThreadPriority extends Thread {
    @Override
    public void run()
    {
        for(int i=1;i<=3;i++){
            System.out.println(getName());
      System.out.println(getPriority());
        }
    }
    public static void main(String[]args)
    {
        ThreadPriority tp= new ThreadPriority();
        tp.setName("Virat KOhli");
        tp.setPriority(10);
        tp.start();
    }
}
