public class ParameterizedConstructor {
     String name;
     int age;
    ParameterizedConstructor(String name, int age)//Constructor
    {
        this.name=name;
        this.age=age;
    }
    public static void main (String[]args)
    {
        ParameterizedConstructor d1= new ParameterizedConstructor("Puneet Sharma", 19);
        ParameterizedConstructor d2= new ParameterizedConstructor("InderJot Riar", 21);
        System.out.println(d1.name+".."+d1.age);
        System.out.println(d2.name+".."+d2.age);
    }
    
}
