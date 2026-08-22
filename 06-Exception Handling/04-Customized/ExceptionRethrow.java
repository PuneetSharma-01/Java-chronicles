public class ExceptionRethrow {
    public static void main(String[] args)
    {
        Thar r = new Thar();
        try {
            r.methodone();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in Main");
        }

    }
    
}
class Thar extends ExceptionRethrow{

    public void methodone()
    {
        try{
        methodtwo();
        }
        catch(ArithmeticException ie)
        {
            System.out.println("Exception caught in MethodOne");
         throw ie;//Rethrowing Exception
        }
    }

    public void methodtwo()
    {
        System.out.println(1000/0);
    }

}