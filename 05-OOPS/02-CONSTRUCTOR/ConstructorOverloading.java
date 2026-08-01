public class ConstructorOverloading {
    private String name;
    private int  marks;
    ConstructorOverloading(String name)
    {
        this.name=name;
    }
    ConstructorOverloading(int marks)
    {
        this.marks=marks;
    }
    
    public static void main(String[]args)
    {
         ConstructorOverloading c1=new ConstructorOverloading("Puneet Sharma");
        ConstructorOverloading c2= new ConstructorOverloading(85);  
        System.out.println(c1.name+"..."+c2.marks);
    }
    
}
