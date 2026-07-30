class calculator
{
    public int getnumbers(int num1,int num2)
    {
        return num1 + num2;
    }
    public int getnumbers(int num1,int num2,int num3)
    {
        return num1 + num2 + num3;
    }
}

public class methodoverloadingbynumbers {
    public static void main(String[]args)
    {
        calculator cal1= new calculator();
        System.out.println(cal1.getnumbers(2,4)+ "..."+cal1.getnumbers(2,5,6));

    }
    
}
