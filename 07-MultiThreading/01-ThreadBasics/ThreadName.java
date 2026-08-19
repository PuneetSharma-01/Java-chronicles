public class ThreadName extends Thread{
    public String name;
    @Override
    public void run()
    {
      System.out.println(getName());
    }

    public static void main(String[] args) {
        {
            ThreadName t=new ThreadName();
            t.setName("Virat Kohli");
            t.start();
            System.out.println("Sachin Tendulakar");
        }
    }
    
}
