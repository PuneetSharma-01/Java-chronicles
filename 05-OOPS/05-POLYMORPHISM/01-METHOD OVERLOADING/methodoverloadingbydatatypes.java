class calculator
{
    public int getnumber(int number)
    {
        return number;
    }
    public double getnumber(double number)
    {
        return number;
    }
}

public class methodoverloadingbydatatypes {
    public static void main(String[]args)    {
        calculator cal2 = new calculator();
        System.out.println(cal2.getnumber(10)+"..."+cal2.getnumber(10.5));



    }
    
}
