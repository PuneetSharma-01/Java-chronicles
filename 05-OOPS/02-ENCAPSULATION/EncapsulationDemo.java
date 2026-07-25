public class EncapsulationDemo {
String studentname;
public String getnamee()
{
    return studentname ;
} 
public static void main(String[] args) {
    {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.studentname="PUNEETSHARMA";
        System.out.println(obj.getnamee());
    }
}

    
}
