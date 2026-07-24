public class ObjectReference {
    String studentname;
    int rollno;
    public String getname()
    {
        return studentname;
    }
    public int getrollno()
    {
        return rollno;
    }
    public static void main(String[]args)
    {
     ObjectReference obj= new ObjectReference();
     obj.studentname="Aayushman Khurana ";
     obj.rollno = 14302;
     System.out.println("Student name :" + obj.getname() +"\nStudent Rollno :" + obj.getrollno());
    }
    
}
