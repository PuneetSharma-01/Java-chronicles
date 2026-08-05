import java.io.*;
public class CreateFile {
    public static void main(String[] args) throws IOException {
        {
            File f=new File("Cricket.txt");
            f.createNewFile();
            if(f.exists())
            {
            System.out.println("File Created Succesfully");
            }
            else
            {
                System.out.println("No File Found");
            }
        }
    }
    
}
