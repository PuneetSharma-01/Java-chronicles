public class UpdateArrayElement {

    public static void main(String[]args)
    {
        int arr[]=new int[]{100,200,300,400,500};//Declaration and initialization of an array
        arr[4]=1000;//Updating the element of an array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
