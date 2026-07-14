public class SumofArrayElement {
    static int sum=0;
    public static void main(String[]args)
    {
    
        int[] arr= new int [5];//Declaration done
        arr[0]=1000;      /* Initalization  of array */
        arr[1]=2000;         
        arr[2]=3000;         
        arr[3]=4000;
        arr[4]=5000;
       
        for(int i=0;i<arr.length;i++)
            {
             sum=sum+arr[i];
             System.out.println(arr[i]);
            }
            System.out.println("The Sum of Array is " + sum);
        
    }
}