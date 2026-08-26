public class RunnableBasedAnonymousInnerClass {
    public static void main(String[] args) {
        Runnable R= new Runnable() {
         
            @Override
            public void run()
            {
                System.out.println("Sachin Tendulkar");
            }
        };
        Thread t=new Thread(R);
        t.start();
    }
    
}
