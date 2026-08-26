interface greetings
{
    void sayHello();
}

public class InterfaceBasedAnonymousInnerClass {
    public static void main(String[] args) {
        greetings g=new greetings()
        {
        @Override
         public void sayHello()
         {
             System.out.println("Girl is saying Hello");
  
         }
      };
      g.sayHello();
    }
}
