public class InstanceVariable{
    int rollno;//Instance variables
    String name;//Instance variable
    public String getname()
    {
        return name;
    }
    public int getrollno()
    {
        return rollno;
    }
    public static void main(String[]args)
    {
        InstanceVariable var = new InstanceVariable();
        var.name="PUNEET SHARMA";
        var.rollno= 56;
        System.out.println("Name is : " + var.getname() + "\nRollno is :" + var.getrollno());

    }

    


}
