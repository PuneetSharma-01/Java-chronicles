public class MultipleObjects {
    String name;
    int marks;
    public String getname()
    {
        return name;
    }
    public int getmarks()
    {
        return marks;
    }
    public static void main(String[] args) {
        {
            MultipleObjects Obj1= new MultipleObjects();
            MultipleObjects Obj2= new MultipleObjects(); 
            MultipleObjects Obj3= new MultipleObjects();
            Obj1.name="Puneet Sharma";
            Obj2.name="Divyam Mahajan";
            Obj3.name="Ridhita Sharma";
            Obj1.marks=96;
            Obj2.marks=87;
            Obj3.marks=92;
            System.out.println(Obj1.getname() + Obj1.getmarks());
            System.out.println(Obj2.getname() + Obj2.getmarks());
            System.out.println(Obj3.getname() + Obj3.getmarks());
        }
    }
    
}
