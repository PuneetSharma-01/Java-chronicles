public class ExceptionPropogation {
    public static void main(String[] args) {
        Blueprint e= new Blueprint();
        try{
        e.method1();
        }
        catch(ArithmeticException ie)
        {
            System.out.println("Not Divide by Zero");
        }
    }
    
}
class Blueprint extends ExceptionPropogation
{
    public void method1()
    {
      method2();
    }

    public void method2()
    {
       System.out.println(10/0);
    }
}
