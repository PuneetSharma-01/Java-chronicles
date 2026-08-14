public class BasicTryCatch {
    public static void main(String[]args)
    {
        int num1=1200;
      //  System.out.println(num1/0); 
      // WE GET ARITHMETIC EXCEPTION HERE
      // SO WE WILL USE TRY CATCH NOW
      try {
        System.out.println(num1/0);
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by Zero");
      } 
    }
}
