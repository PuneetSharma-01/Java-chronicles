public class NestedTryCatch {
    public static void main(String[]args)
    {
        int var1=1100;
        int[]arr={10,20,30};
        try { 
            System.out.println(var1/100);
            try {
                System.out.println(arr[3]);
            } catch (IndexOutOfBoundsException ie) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        } catch (ArithmeticException e) {
            System.out.println(var1 + " not divide by Zero");
        }
    }
    
}
