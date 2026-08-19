public class MultiThread extends Thread {
    @Override
    public void run()
    {
     for(int i=1;i<=3;i++)
     {
        System.out.println("Virat Kohli");
     }
    }
    public static void main(String[] args) {
            MultiThread m1=new MultiThread();//Creation of Thread object
            MultiThread m2=new MultiThread();
            m1.start();
            m2.start();
            for(int j=1;j<=5;j++)
            {
                System.out.println("MS Dhoni");
            }
    }
}
