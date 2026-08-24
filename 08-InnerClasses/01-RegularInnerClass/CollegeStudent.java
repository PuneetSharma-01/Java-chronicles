public class CollegeStudent {
    class student
    {
        String name;
        int rollno;
        public void studentdetail(String name, int rollno)
        {
           this.name= name;
           this.rollno=rollno;
           System.out.println("Student Name.."+this.name);
           System.out.println("Rollno.."+this.rollno);
        }
    }
    public static void main(String[] args) {
        CollegeStudent CS1=new CollegeStudent();
        CollegeStudent.student S1= CS1.new student();
        S1.studentdetail("Virat Kohli", 1278);
    }
}
