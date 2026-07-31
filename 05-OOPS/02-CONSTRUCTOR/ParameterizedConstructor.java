public class ParameterizedConstructor {
    private String name;
    private int age;
    ParameterizedConstructor(String name, int age)//Constructor
    {
        this.name=name;
        this.age=age;
        System.out.println(name+"..."+age);
    }
    public static void main (String[]args)
    {
        ParameterizedConstructor d1= new ParameterizedConstructor("Puneet Sharma", 19);
        ParameterizedConstructor d2= new ParameterizedConstructor("InderJot Riar", 21);
    }
    
}
