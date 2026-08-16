public class ThrowKeyword {
    public static void main(String[] args) {
          int age=15;
            try{
            if(age>17)
            {
                System.out.println("Eligible");
            }
            else
            {
                throw new ArithmeticException("Your Age must be above 18");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

