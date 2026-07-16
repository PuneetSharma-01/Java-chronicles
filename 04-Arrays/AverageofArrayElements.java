public class AverageofArrayElements {
    static double avg=0;
    public static void main(String[]args)
    {
        int [] arr= new int [10];//declaration
        arr[0]=1000;
        arr[1]=2000;
        arr[2]=3000;
        arr[3]=4000;
        arr[4]=5000;
        arr[5]=6000;
        arr[6]=7000;
        arr[7]=8000;
        arr[8]=9000;
        arr[9]=10000;
        
        for(int i=0;i<arr.length;i++)
        {
            avg=avg+arr[i]/10;// Logic to Find Average 
            System.out.println(arr[i]);
        }
        System.out.println("The Average is "+ avg);

    }
    
}
