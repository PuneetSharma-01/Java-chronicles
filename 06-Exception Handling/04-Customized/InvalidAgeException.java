public class InvalidAgeException {
    public static void main(String[] args) {
        int age=15;
        try {
            if (age>=18)
            {
            System.out.println("Eligible");  
            }
            else
           {
            throw  new ArithmeticException("Restricted! You must be 18");
           }
    }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }

    
}
