public class FinallyBlock {
    public static void main(String[]args)
    {
        int num1=5000;
        //System.out.println(num1/0);
        try{System.out.println(num1/0);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        finally
        {
            System.out.println(num1/10);
        }
    }
}
