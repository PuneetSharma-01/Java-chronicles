public class MultipleCatch {
    public static void main(String[] args) {
        {
            int num1=2500;
            int[] arr ={10,20,30};
            //System.out.println(num1/0); 
            //System.out.println(arr[3]);

            try{System.out.println(num1/10);
                System.out.println(arr[3]);
            }catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException a)
            {
                System.out.println("Array Size is less");
            }
            
        }
    }
}    

