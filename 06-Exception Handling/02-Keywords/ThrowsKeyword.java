public class ThrowsKeyword {
    void divide(int num1, int num2) throws ArithmeticException
    {
    System.out.println(num1/num2);

    }
     public static void main(String[]args){
        
     ThrowsKeyword th=new ThrowsKeyword();
    
    //th.divide(10,0);

      try {
        th.divide(10,0);
      } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero");
      }
   }
}
