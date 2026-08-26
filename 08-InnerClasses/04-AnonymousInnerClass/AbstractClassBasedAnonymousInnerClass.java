abstract class student
{
    abstract void studentRollNo();
}

public class AbstractClassBasedAnonymousInnerClass {
    public static void main(String[] args) {
        student s=new student()
        {
            @Override
            public void studentRollNo()
            {
                System.out.println("RollNo..143562");
            }
        };
        s.studentRollNo();
    }
}
