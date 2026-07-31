public class DefaultConstructor {
    int i=10;
    
    DefaultConstructor()//Constructor
    {
     //Default Constructor
     System.out.println("IS CREATED");
    }
    public static void main (String[]args)
    {
        DefaultConstructor d1= new DefaultConstructor();
        System.out.println(d1.i);
    }
}

