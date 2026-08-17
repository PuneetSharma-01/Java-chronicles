
import java.io.FileReader;
import java.io.IOException;

public class CheckedException
{

    public static void main(String[]args)
    {
        try{FileReader obj=new FileReader("Cricket.txt");
        System.out.println(obj);
            System.out.println(obj.read());
      }
      catch(IOException e){
        System.out.println(e.getMessage());
      }

    }
}