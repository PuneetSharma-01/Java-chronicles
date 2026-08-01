public class CopyConstructor {

     String name;
     int age;
    CopyConstructor(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    CopyConstructor(CopyConstructor s1)
    {
        this.name=s1.name;
        this.age=s1.age;
    }
    public static void main(String[] args) {
        {
            CopyConstructor s1= new CopyConstructor("PuneetSharma",23);
            CopyConstructor s2= new CopyConstructor(s1);
            System.out.println(s2.name+"..."+s2.age);
        }
    }
}
