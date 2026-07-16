public class LargestArrayElement {
    public static void main(String[]args)
    {
        int[] var1= new int[] {12,5,7,35,18};
        int largest=var1[0];
        for(int i=1;i<var1.length;i++)
        {
            if(var1[i]>largest)
            {
                largest=var1[i];
            }
        }
        System.out.println("The Largest Element is " +largest);

    }
    
}
