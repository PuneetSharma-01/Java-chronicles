public class SmallestArrayElement {
    public static void main(String[]args)
    {
      int[] arr=new int[] {18,5,12,1,26};
      int smallest=arr[0];
       for(int i=0;i<arr.length;i++)
     {
          if(arr[i]<smallest)
           {
            smallest=arr[i];
           }
     }
     System.out.println("The Smallest Element is " +smallest);
    }
}
